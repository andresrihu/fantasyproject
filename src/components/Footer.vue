<template>
  <div>
    <div class="container">
      <h1>Not just another Fantasy Football Website</h1>
      <div class="bottom">
        <h3>
          Created By Andres Rivera Hurtado, Carmen Shannon, John Cunningham, Max
          Ofosu
        </h3>
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
.container {
  display: flex;
  position: fixed;
  bottom: 0;
  width: 100%;
  background-color: rgb(0, 0, 0);
  color: white;
  height: 80px;
  justify-content: space-evenly;
  align-items: center;
  text-align: center;
}
.bottom {
  align-self: center;
  display: flex;
}
</style>
