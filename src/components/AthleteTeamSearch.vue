<template>
  <div class="maincontainer">
    <form @submit.prevent="handlSubmit">
      <label for="search">Select team or player then search by name:</label>
      <input name="search" id="search" placeholder="Search" />
      <div class="radiocontainer">
        <div class="form-check">
          <input
            type="radio"
            name="flexRadioDefault"
            id="player"
            value="player"
            class="form-check-input"
            checked
          />
          <label for="player" class="form-check-label">Player</label>
        </div>
        <div class="form-check">
          <input
            type="radio"
            name="flexRadioDefault"
            id="team"
            value="team"
            class="form-check-input"
          />
          <label for="team" class="form-check-label">Team</label>
        </div>
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
</style>
