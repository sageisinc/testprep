import React, { useState } from "react";

const Login = () => {
  const [username, setUsername] = useState("");
  const [password, setPassword] = useState("");

  const handleSubmit = (e) => {
    e.preventDefault();
    // TODO: Implement authentication logic here
    alert(`Username: ${username}\nPassword: ${password}`);
  };

  return (
    <div style={{ maxWidth: 320, margin: "40px auto", padding: 24, border: "1px solid #ccc", borderRadius: 8 }}>
      <h2>Login</h2>
      <form onSubmit={handleSubmit}>
        <div style={{ marginBottom: 12 }}>
          <label>
            Username:
            <input
              type="text"
              value={username}
              onChange={e => setUsername(e.target.value)}
              required
              style={{ width: "100%", padding: 8, marginTop: 4 }}
            />
          </label>
        </div>
        <div style={{ marginBottom: 12 }}>
          <label>
            Password:
            <input
              type="password"
              value={password}
              onChange={e => setPassword(e.target.value)}
              required
              style={{ width: "100%", padding: 8, marginTop: 4 }}
            />
          </label>
        </div>
        <button type="submit" style={{ width: "100%", padding: 10 }}>Login</button>
      </form>
    </div>
  );
};

export default Login;