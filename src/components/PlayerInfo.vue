<template>
  <div class="container">
    <div class="main">
      <h2>{{ playerName }}</h2>
      <div id="circle"></div>
    </div>
    <br />
    <div class="credentials">
      <div class="list-group">
        <p class="list-group-item list-group-item-action">
          Username: {{ username }}
        </p>
      </div>
      <button class="btn btn-primary" id="button">Edit Profile</button>
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
      username: "Username",
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
#button {
  margin-top: 10px;
}
</style>
