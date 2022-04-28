<template>
  <div class="maincontainer">
    <div id="navBar">
      <div id="leftPanel">
        <div id="profile" class="navitem">
          <router-link to="/">
            <h1>{{ pageTitle }}</h1>
          </router-link>
        </div>
        <div class="links navitem" id="navLinks">
          <router-link to="#">{{ stats }}</router-link>
          <router-link to="/fantasyhome">{{ fantasy }}</router-link>
          <router-link to="#">{{ live }}</router-link>
        </div>
      </div>
      <div id="rightPanel">
        <div class="navitem signin">
          <img :src="signImage" alt="sign in" id="signin" />
          <router-link to="/signup">Sign In</router-link>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
/* eslint-disable */
export default {
  name: "Header",
  data() {
    return {
      pageTitle: "Fantasy Football",
      stats: "Stats",
      fantasy: "Fantasy Page",
      live: "Live Games",
      signImage: require("../assets/signImage.png"),
    };
  },
};
</script>

<style scoped>
* {
  margin: 0;
  padding: 0;
}
.signin {
  display: flex;
  justify-content: center;
  align-items: center;
}
a {
  text-decoration: none;
}
#signin {
  margin-right: 10px;
  width: 20px;
  height: 20px;
}
.navitem * {
  color: white;
}
.maincontainer {
  position: fixed;
  top: 0;
  left: 0;
  right: 0;
  width: 100%;
}
#navBar {
  height: 80px;
  width: 100%;
  background-color: rgb(54, 28, 199);
  display: flex;
}
#leftPanel {
  width: 100%;
  display: flex;
  justify-content: space-evenly;
  align-items: center;
}
#profile {
  display: flex;
  justify-content: center;
  align-items: center;
}
.links {
  display: flex;
  align-items: center;
  justify-content: space-evenly;
}
#rightPanel {
  height: 80px;
  width: 40%;
  background-color: rgba(54, 28, 199, 0.459);
  display: flex;
  justify-content: center;
  align-items: center;
}
.links * {
  margin: 0px 15px;
}
</style>
