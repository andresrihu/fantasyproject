<template>
  <div class="container">
    <div class="main">
      <h2>{{ playerName }}</h2>
      <div id="circle"></div>
      <h3>{{ teamName }}</h3>
      <a href="#">Update {{ teamName }}</a>
    </div>
    <br />
    <div class="credentials">
      <form class="form" action="/register" method="post">
        <input class="form-control" type="text" placeholder="Player Name" />
        <br />
        <input class="form-control" type="text" placeholder="Email" />
        <br />
        <input
          class="form-control"
          type="password"
          placeholder="New Password"
        />
        <br />
        <input class="btn btn-outline-primary form-control" value="Submit" />
      </form>
    </div>
  </div>
</template>

<script>
export default {
  name: "PlayerInfo",
  data() {
    return {
      playerName: "Player Name",
      leagueTeam: "League Team Name",
      teamName: "Team Name",
      email: "email@fantasy.com",
    };
  },
};
</script>

<style scoped>
* {
  margin: 0;
  padding: 0;
}

.container {
  text-align: center;
  margin: 0 auto;
  width: 500px;
  background-color: aliceblue;
}

#circle {
  width: 200px;
  height: 200px;
  border-radius: 50%;
  border: 1px solid black;
  margin: 0 auto;
}

.form {
  display: flex;
  flex-direction: column;
  margin: 0 auto;
}

</style>
