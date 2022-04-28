<template>
  <div class="content">
    <LeagueSettingsAdmin />
  </div>

  <Footer />
</template>

<script>
import LeagueSettingsAdmin from "../components/LeagueSettingsAdmin.vue";

export default {
  name: "CreateLeague",
  components: {
    LeagueSettingsAdmin: LeagueSettingsAdmin,
  },
};
</script>

<style scoped>
.content {
  margin-top: 10px;
}
</style>
