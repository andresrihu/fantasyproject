<template>
  <div>
    <form @submit.prevent="handlSubmit">
      <h1>Log In</h1>
      <label>Email</label>
      <input type="email" required v-model="email" />
      <label>Password</label>
      <input type="password" required v-model="password" />
      <div class="submit">
        <button>Log In</button>
      </div>
    </form>
  </div>
</template>

<script>
/* eslint-disable */
export default {
  data() {
    return {
      userName: "",
      email: "",
      password: "",
      confirm_password: "",
      passwordError: "",
      nameError: "",
      pw_match: false,
    };
  },
};
</script>

<style>
form {
  max-width: 420px;
  margin: 30px auto;
  background: rgb(104, 101, 101);
  text-align: left;
  padding: 40px;
  border-radius: 10px;
}
label {
  color: #aaa;
  display: inline-block;
  margin: 25px 0 15px;
  font-size: 0.6em;
  text-transform: uppercase;
  letter-spacing: 1px;
  font-weight: bold;
}
input {
  display: block;
  padding: 10px 6px;
  width: 100%;
  box-sizing: border-box;
  border: none;
  border-bottom: 1px solid #ddd;
  color: #555;
}
button {
  background: rgba(6, 6, 255, 0.562);
  border: 0;
  padding: 10px 20px;
  margin-top: 20px;
  color: white;
  border-radius: 20px;
}
.submit {
  text-align: center;
}
h1 {
  color: white;
}
</style>
