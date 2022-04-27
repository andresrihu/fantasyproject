<template>
  <Header />
  <router-view />
  
  
</template>

<script>
// eslint-disable 
import Header from "./components/Header.vue";
// eslint-disable-next-line no-mixed-spaces-and-tabs



export default {
  name: "App",
  components: {
    Header: Header,
    
    
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
