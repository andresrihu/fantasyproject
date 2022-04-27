<template>
  <Header />
  <router-view />
  <Footer/>
  
</template>

<script>
// eslint-disable 
import Header from "./components/Header.vue";
// eslint-disable-next-line no-mixed-spaces-and-tabs

import Footer from "./components/Footer.vue";

export default {
  name: "App",
  components: {
    Header: Header,
    Footer: Footer,
    
  },
};
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

nav {
  padding: 30px;
}

nav a {
  font-weight: bold;
  color: #2c3e50;
}

nav a.router-link-exact-active {
  color: #42b983;
}
</style>
