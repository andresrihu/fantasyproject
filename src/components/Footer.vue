<template>
  <div>
    <div class="footercontainer">
      <h1>Fantasy Football Website</h1>
      <div class="bottom">
        <h5>
          Created By Andres Rivera Hurtado, Carmen Shannon, John Cunningham, Max
          Ofosu
        </h5>
      </div>
    </div>
  </div>
</template>

<script>
/* eslint-disable */
export default {
  name: "Footer",
  data() {
    //   empty comment to push changes to git
    return {};
  },
};
</script>

<style scoped>
h1 {
  text-align: center;
}
.footercontainer {
  display: flex;
  background-color: rgb(0, 0, 0);
  color: white;
  width: 100%;
  position: fixed;
  bottom: 0;
  left: 0;
  right: 0;
  align-items: center;
  justify-content: space-around;
}
.bottom {
  align-self: center;
  display: flex;
}
</style>
