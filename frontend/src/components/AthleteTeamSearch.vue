<template>
  <div class="maincontainer">
    <form @submit.prevent>
      <label for="search">Select team or player then search by name:</label>
      <input
        v-model="search"
        name="search"
        id="search"
        placeholder="Search"
        class="form-control"
      />
      <div class="radiocontainer">
        <select
          name="playerteam"
          id="playerteam"
          class="form-select"
          v-model="playerteam"
        >
          <option value="player" selected>Player</option>
          <option value="team">Team</option>
        </select>
      </div>
      <input
        @click="emitData(search, playerteam)"
        type="submit"
        value="Search"
        class="btn btn-primary"
      />
    </form>
  </div>
</template>

<script>
export default {
  name: "AthleteTeamSearch",
  data() {
    return {
      search: "",
      playerteam: "player",
    };
  },
  methods: {
    emitData(playerteam) {
      this.$emit("searchparam", search, playerteam);
      console.log(playerteam, search);
    },
  },
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
