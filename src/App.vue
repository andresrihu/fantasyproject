<template>
  <Header />
  <Footer />
  <router-view />
</template>

<script>
import Header from "./components/Header.vue";
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
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}
</style>
