<template>
  <div class="maincontainer">
    <form @submit.prevent="handlSubmit">
      <label for="search">Select team or player then search by name:</label>
      <input
        name="search"
        id="search"
        placeholder="Search"
        class="form-control"
      />
      <div class="radiocontainer">
        <select name="playerteam" id="playerteam" class="form-select">
          <option value="player" selected>Player</option>
          <option value="team">Team</option>
        </select>
      </div>
      <input type="submit" value="Search" class="btn btn-primary" />
    </form>
  </div>
</template>

<script>
export default {
  name: "AthleteTeamSearch",
};
</script>

<style scoped>
form {
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
}
.radiocontainer {
  display: flex;
  flex-direction: column;
  align-items: flex-start;
  justify-content: center;
}
select {
  margin: 25px 0px;
}
</style>
