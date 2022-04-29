<template>
  <div class="content">
    <AthleteDetailedInfo :athleteview="athlete" />
  </div>
</template>

<script>
import AthleteDetailedInfo from "../components/AthleteDetailedInfo.vue";
import axios from "axios";

export default {
  name: "AthleteViewOne",
  components: {
    AthleteDetailedInfo: AthleteDetailedInfo,
  },
  data() {
    return {
      athlete: null,
    };
  },
  async created() {
    const API_URL = `http://localhost:8080/athletes/${this.$route.params.id}`;
    var response = await axios.get(API_URL);
    this.athlete = response.data;
    this.components.AthleteDetailedInfo.props.athleteview = this.athlete;
  },
};
</script>

<style scoped>
.content {
  margin-top: 10px;
}
</style>
