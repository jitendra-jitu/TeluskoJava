<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Jitu Job Portal API</title>
    <style>
        body { font-family: Arial; margin: 40px; }
        h1 { color: #2c3e50; }
        h2 { color: #2980b9; }
        ul { line-height: 1.8; }
    </style>
</head>
<body>
<h1>Welcome to the Jitu Job Portal API</h1>
<h2>Available Controllers & Paths:</h2>

<h3>1. Welcome Controller</h3>
<ul>
    <li>GET /welcome</li>
</ul>

<h3>2. Help Controller</h3>
<ul>
    <li>GET /help</li>
</ul>

<h3>3. Job Controller</h3>
<ul>
    <li>GET /jobPosts → Get all job posts</li>
    <li>GET /jobPost/{postid} → Get a job by ID</li>
    <li>GET /jobPosts/keyword/{keyword} → Search jobs</li>
    <li>POST /jobPost → Add a new job</li>
    <li>PUT /jobPost → Update existing job</li>
    <li>DELETE /jobPost/{postid} → Delete job</li>
</ul>

<h3>4. Load Controller</h3>
<ul>
    <li>GET /load → Load 5 default job entries</li>
</ul>

<h3>5. Future Additions (Coming Soon)</h3>
<ul>
    <li>/jobs/category/{category}</li>
    <li>/jobs/location/{location}</li>
    <li>/jobs/company/{company}</li>
    <li>/jobs/latest</li>
</ul>

<hr>
<p><strong>API Base URL:</strong> http://localhost:8080</p>
<p><strong>Frontend URL:</strong> http://localhost:5000</p>
</body>
</html>
