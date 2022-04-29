<template>
  <div class="maincontainer">
    <h2>{{ $props.athleteview.name }}</h2>
    <table class="table table-dark table-hover">
      <thead>
        <tr>
          <th>Age</th>
          <th>Position</th>
          <th>Average Fantasy PPG</th>
          <th>Career Passing Yards</th>
        </tr>
      </thead>
      <tbody>
        <tr>
          <td>{{ $props.athleteview.age }}</td>
          <td>{{ $props.athleteview.pos }}</td>
          <td>{{ $props.athleteview.fantasyPpg }}</td>
          <td>{{ $props.athleteview.passingYds }}</td>
        </tr>
      </tbody>
    </table>
  </div>
</template>

<script>
// const axios = require("axios");

// const API_URL = `http://localhost:8080/athletes/${this.id}`

// console.log(this.getProps);

export default {
  name: "AthleteDetailedInfo",
  data() {
    return {};
  },
  props: {
    athleteview: {
      type: Object,
      required: true,
    },
  },
  created() {
    console.log(this.$props.athleteview);
  },
};
</script>

<style scoped></style>
