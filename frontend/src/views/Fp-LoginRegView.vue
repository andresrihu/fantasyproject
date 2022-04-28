<template>
  <div class="maincontainer">
    <div class="leftcontainer">
      <h3>Register</h3>
      <Register />
    </div>
    <div class="rightcontainer">
      <h3>Login</h3>
      <Login />
    </div>
  </div>
</template>

<script>
import Register from "../components/RegistrationComponent.vue";
import Login from "../components/LoginComponent.vue";

export default {
  name: "LoginReg",
  components: {
    Register: Register,
    Login: Login,
  },
};
</script>

<style scoped>
.maincontainer {
  margin: 0 auto;
  display: flex;
  justify-content: space-evenly;
  align-items: center;
  width: 100%;
  height: 100%;
}
.leftcontainer,
.rightcontainer {
  flex: 1;
  margin: 0px 30px;
}
</style>
