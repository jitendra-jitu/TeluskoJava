import React, { useState, useEffect } from 'react';
import { Typography, TextField, Button, Paper, Box } from '@mui/material';
import { useLocation, useNavigate } from 'react-router-dom';
import axios from 'axios';

const Edit = () => {
  const location = useLocation();
  const navigate = useNavigate();
  const [form, setForm] = useState({
    postId: '',
    postProfile: '',
    reqExperience: 0,
    postTechStack: [],
    postDesc: '',
  });
  const [skillSet] = useState(['Javascript', 'Java', 'Python', 'Django', 'Rust']);
  const id = parseInt(location.state?.id, 10); // Convert to number

  useEffect(() => {
    if (isNaN(id)) {
      console.error("No valid post ID provided");
      return;
    }

    const fetchPost = async () => {
      try {
        const response = await axios.get(`http://localhost:8080/jobPosts/${id}`);
        setForm(response.data);
      } catch (error) {
        console.error('Error fetching post:', error);
      }
    };

    fetchPost();
  }, [id]);

  const handleChange = (e) => {
    const { name, value, type, checked } = e.target;
    if (type === 'checkbox') {
      setForm((prevForm) => ({
        ...prevForm,
        postTechStack: checked
          ? [...prevForm.postTechStack, value]
          : prevForm.postTechStack.filter((skill) => skill !== value),
      }));
    } else {
      setForm({ 
        ...form, 
        [name]: type === 'number' ? parseInt(value, 10) : value // Convert number inputs
      });
    }
  };

  const handleSubmit = async (e) => {
    e.preventDefault();
    
    if (isNaN(form.postId)) {
      console.error("Invalid postId for submission:", form.postId);
      return; // Prevent submission if postId is invalid
    }
    
    try {
      await axios.put(`http://localhost:8080/jobPosts/${form.postId}`, form);
      navigate('/'); // Navigate to home after submission
    } catch (error) {
      console.error('Error updating post:', error.response ? error.response.data : error.message);
    }
  };

  return (
    <Paper sx={{ padding: '2%', maxWidth: '600px', margin: 'auto' }} elevation={3}>
      <Typography align="center" variant="h5" sx={{ marginBottom: '20px' }}>
        Edit Post
      </Typography>
      <form onSubmit={handleSubmit}>
        <Box sx={{ display: 'flex', flexDirection: 'column', alignItems: 'center' }}>
          <TextField
            type="number"
            name="postId"
            label="Post ID"
            value={form.postId}
            disabled
            sx={{ width: '100%', marginBottom: '20px' }}
          />
          <TextField
            type="text"
            name="postProfile"
            label="Job Profile"
            value={form.postProfile}
            onChange={handleChange}
            required
            sx={{ width: '100%', marginBottom: '20px' }}
          />
          <TextField
            type="number"
            name="reqExperience"
            label="Years of Experience"
            value={form.reqExperience}
            onChange={handleChange}
            required
            sx={{ width: '100%', marginBottom: '20px' }}
          />
          <TextField
            type="text"
            name="postDesc"
            label="Job Description"
            value={form.postDesc}
            onChange={handleChange}
            required
            multiline
            rows={4}
            sx={{ width: '100%', marginBottom: '20px' }}
          />
          <Box sx={{ width: '100%', marginBottom: '20px' }}>
            <Typography variant="body1" sx={{ marginBottom: '10px' }}>
              Required Skills
            </Typography>
            <ul style={{ paddingLeft: '20px' }}>
              {skillSet.map((skill, index) => (
                <li key={index}>
                  <label>
                    <input
                      type="checkbox"
                      name="postTechStack"
                      value={skill}
                      checked={form.postTechStack.includes(skill)}
                      onChange={handleChange}
                    />
                    {skill}
                  </label>
                </li>
              ))}
            </ul>
          </Box>
          <Button
            variant="contained"
            type="submit"
            sx={{ width: '100%' }}
          >
            Update
          </Button>
        </Box>
      </form>
    </Paper>
  );
};

export default Edit;
