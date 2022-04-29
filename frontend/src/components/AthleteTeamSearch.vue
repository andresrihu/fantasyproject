<template>
  <div class="maincontainer">
    <form @submit.prevent>
      <label for="search">Select team or player then search by name:</label>
      <input
        @change="emitSearch(search)"
        v-model="search"
        name="search"
        id="search"
        placeholder="Search"
        class="form-control"
      />
      <div class="radiocontainer">
        <select
          @change="emitPlayerteam(playerteam)"
          name="playerteam"
          id="playerteam"
          class="form-select"
          v-model="playerteam"
        >
          <option value="player" selected>Player</option>
          <option value="team">Team</option>
        </select>
      </div>
      <input type="button" value="Search" @click="performSearch(search)" />
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
    emitPlayerteam(playerteam) {
      this.$emit("playerteam", playerteam);
      console.log(playerteam);
    },
    emitSearch(search) {
      this.$emit("searchvalue", search);
      console.log(search);
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
