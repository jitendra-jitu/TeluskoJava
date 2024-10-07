import React, { useEffect, useState } from "react";
import { Card, Grid, Typography, Box, IconButton } from "@mui/material";
import DeleteIcon from '@mui/icons-material/Delete';
import EditIcon from '@mui/icons-material/Edit';
import axios from "axios";
import { useNavigate } from "react-router-dom";

const AllPosts = ({ searchKeyword }) => {
  const [posts, setPosts] = useState([]);
  const navigate = useNavigate();

  useEffect(() => {
    const fetchPosts = async () => {
      try {
        const response = await axios.get("http://localhost:8080/jobPosts");
        setPosts(response.data._embedded.jobPosts); // Adjust for data structure
      } catch (error) {
        console.error("Error fetching posts:", error);
      }
    };
    fetchPosts();
  }, []);

  const filteredPosts = posts.filter((post) =>
    post.postProfile.toLowerCase().includes(searchKeyword.toLowerCase()) ||
    post.postDesc.toLowerCase().includes(searchKeyword.toLowerCase())
  );

  const handleDelete = async (id) => {
    try {
      await axios.delete(`http://localhost:8080/jobPosts/${id}`);
      setPosts(posts.filter((post) => post.postId !== id));
    } catch (error) {
      console.error("Error deleting post:", error);
    }
  };


  const handleEdit = (id) => {
    navigate("/edit", { state: { id } });
  };

  return (
    <Box sx={{ padding: "2%" }}>
      <Grid container spacing={3}>
        {filteredPosts.length > 0 ? (
          filteredPosts.map((post) => (
            <Grid key={post.postId} item xs={12} sm={6} md={4}> {/* Ensure key is correctly added here */}
              <Card
                sx={{
                  padding: "15px",
                  width: "90%",
                  backgroundColor: "#add8e6",
                  boxShadow: 3,
                  transition: "transform 0.3s, box-shadow 0.3s",
                  height: "auto",
                  position: "relative",
                  overflow: "auto",
                  "&:hover": {
                    transform: "scale(1.03)",
                    boxShadow: 6,
                  },
                }}
              >
                <Typography variant="h6" sx={{ fontWeight: 800, color: "#000000", fontSize: "25px" }}>
                  {post.postProfile}
                </Typography>
                <Typography sx={{ mt: 1, fontWeight: 600, color: "#000000", fontSize: "16px" }}>
                  Description:
                </Typography>
                <Typography sx={{ mb: 1, fontWeight: 600, fontSize: "14px" }}>
                  {post.postDesc}
                </Typography>
                <Typography sx={{ fontWeight: 600, color: "#000000", fontSize: "16px" }}>
                  Experience:
                </Typography>
                <Typography sx={{ mb: 1, fontWeight: 600, fontSize: "14px" }}>
                  {post.reqExperience} years
                </Typography>
                <Typography sx={{ fontWeight: 600, color: "#000000", fontSize: "16px" }}>
                  Skills:
                </Typography>
                <Typography sx={{ fontWeight: 600, fontSize: "14px" }}>
                  {post.postTechStack.join(", ")}
                </Typography>

                <Box
                  sx={{
                    display: "flex",
                    justifyContent: "flex-end",
                    position: "absolute",
                    bottom: "15px",
                    left: "15px",
                    right: "15px",
                  }}
                >
                  <IconButton onClick={() => handleEdit(post.postId)} sx={{ mr: 1 }}>
                    <EditIcon color="primary" />
                  </IconButton>
                  <IconButton onClick={() => handleDelete(post.postId)}>
                    <DeleteIcon color="error" />
                  </IconButton>
                </Box>
              </Card>
            </Grid>
          ))
        ) : (
          <Typography variant="h6" align="center" sx={{ mt: 5, width: "100%" }}>
            No job posts available.
          </Typography>
        )}
      </Grid>
    </Box>
  );
};

export default AllPosts;
