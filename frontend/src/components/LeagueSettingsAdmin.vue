<template>
  <div class="container w-100 p-3 h600">
    <div class="row">
      <div class="col-xs-6">
        <form action="/createLeague" method="POST">
          <div class="form-group">
            <h2 style="text-align: center">Admin Settings</h2>
            <label class="label">League Name</label>
            <input
              v-model="leaguename"
              name="leaguename"
              class="form-control"
              type="text"
            />
          </div>

          <div class="form-group">
            <label class="label">Max Teams</label>
            <input
              v-model="maxteams"
              name="maxteams"
              class="form-control"
              type="number"
            />
          </div>

          <div class="form-group">
            <label class="label">Type of Scoring</label>
            <input
              v-model="typeofscoring"
              name="typeofscoring"
              class="form-control"
              type="number"
            />
          </div>

          <div class="form-group">
            <label class="label">Passing Touchdown Points</label>
            <input
              v-model="passingtdpts"
              name="passingtdpts"
              class="form-control"
              type="number"
            />
          </div>

          <div class="form-group">
            <label class="label">Passing Yards Points</label>
            <input
              v-model="passingydspts"
              name="passingydspts"
              class="form-control"
              type="number"
            />
          </div>

          <div class="form-group">
            <label class="label">Rushing TDs Points</label>
            <input
              v-model="rushingtdspts"
              name="rushingtdspts"
              class="form-control"
              type="number"
            />
          </div>

          <div class="form-group">
            <label class="label">Rushing YDs Points</label>
            <input
              v-model="rushingydspts"
              name="rushingydspts"
              class="form-control"
              type="number"
            />
          </div>

          <div class="form-group">
            <label class="label">Receptions Points</label>
            <input
              v-model="receptionspts"
              name="receptionspts"
              class="form-control"
              type="number"
            />
          </div>

          <div class="form-group">
            <label class="label">Receiving YDs Points</label>
            <input
              v-model="receivingydspts"
              name="receivingydspts"
              class="form-control"
              type="number"
            />
          </div>

          <div class="form-group">
            <label class="label">Receiving TDs Points</label>
            <input
              v-model="receivingtdspts"
              name="receivingtdspts"
              class="form-control"
              type="number"
            />
          </div>

          <div class="form-group">
            <label class="label">Two Point Conversion Points</label>
            <input
              v-model="twoptconvptsdspts"
              name="twoptconvptsdspts"
              class="form-control"
              type="number"
            />
          </div>

          <div class="form-group">
            <label class="label">Fumbles Lost Points</label>
            <input
              v-model="fumbleslostpts"
              name="fumbleslostpts"
              class="form-control"
              type="number"
            />
          </div>

          <div class="form-group">
            <label class="label">Field Goals 0-19 Points</label>
            <input
              v-model="fieldgoals019pts"
              name="fieldgoals019pts"
              class="form-control"
              type="number"
            />
          </div>
          <div class="form-group">
            <label class="label">Field Goals 20-29 Points</label>
            <input
              v-model="fieldgoals2029pts"
              name="fieldgoals2029pts"
              class="form-control"
              type="number"
            />
          </div>
          <div class="form-group">
            <label class="label">Field Goals 30-39 Points</label>
            <input
              v-model="fieldgoals3039pts"
              name="fieldgoals3039pts"
              class="form-control"
              type="number"
            />
          </div>
          <div class="form-group">
            <label class="label">Field Goals 40-49 Points</label>
            <input
              v-model="fieldgoals4049pts"
              name="fieldgoals4049pts"
              class="form-control"
              type="number"
            />
          </div>
          <div class="form-group">
            <label class="label">Field Goals 50+ Points</label>
            <input
              v-model="fieldgoals50pluspts"
              name="fieldgoals50pluspts"
              class="form-control"
              type="number"
            />
          </div>
          <div class="form-group">
            <label class="label">Points Allowed 0 Points</label>
            <input
              v-model="pointsallowed0pts"
              name="pointsallowed0pts"
              class="form-control"
              type="number"
            />
          </div>
          <div class="form-group">
            <label class="label">Points Allowed 1-6 Points</label>
            <input
              v-model="pointsallowed16pts"
              name="pointsallowed16pts"
              class="form-control"
              type="number"
            />
          </div>
          <div class="form-group">
            <label class="label">Points Allowed 7-13 Points</label>
            <input
              v-model="pointsallowed713pts"
              name="pointsallowed713pts"
              class="form-control"
              type="number"
            />
          </div>
          <div class="form-group">
            <label class="label">Points Allowed 14-20 Points</label>
            <input
              v-model="pointsallowed1420pts"
              name="pointsallowed1420pts"
              class="form-control"
              type="number"
            />
          </div>
          <div class="form-group">
            <label class="label">Points Allowed 21-27 Points</label>
            <input
              v-model="pointsallowed2127pts"
              name="pointsallowed2127pts"
              class="form-control"
              type="number"
            />
          </div>
          <label class="label">Points Allowed 28-34 Points</label>
          <div class="form-group">
            <input
              v-model="pointsallowed2834pts"
              name="pointsallowed2834pts"
              class="form-control"
              type="number"
            />
          </div>
          <div class="form-group">
            <label class="label">Points Allowed 35+ Points</label>
            <input
              v-model="pointsallowed35pluspts"
              name="pointsallowed35pluspts"
              class="form-control"
              type="number"
            />
          </div>
          <div class="form-group">
            <label class="label">Sacks Points</label>
            <input
              v-model="sackspts"
              name="sackspts"
              class="form-control"
              type="number"
            />
          </div>
          <div class="form-group">
            <label class="label">Interception Points</label>
            <input
              v-model="pdefinterceptionpts"
              name="pdefinterceptionpts"
              class="form-control"
              type="number"
            />
          </div>
          <div class="form-group">
            <label class="label">Fumble Recovery Points</label>
            <input
              v-model="fumblerecovpts"
              name="fumblerecovpts"
              class="form-control"
              type="number"
            />
          </div>
          <div class="form-group">
            <label class="label">Defense Touchdown Points</label>
            <input
              v-model="deftdpts"
              name="deftdpts"
              class="form-control"
              type="number"
            />
          </div>
          <div class="form-group">
            <label class="label">Safety Points</label>
            <input
              v-model="safetypts"
              name="safetypts"
              class="form-control"
              type="number"
            />
          </div>
          <div class="form-group">
            <label class="label">Blocked Kick Points</label>
            <input
              v-model="blockedkickpts"
              name="blockedkickpts"
              class="form-control"
              type="number"
            />
          </div>
          <div class="form-group">
            <label class="label">Special Teams TDs Points</label>
            <input
              v-model="specialteamstdpts"
              name="specialteamstdpts"
              class="form-control"
              type="number"
            />
          </div>
          <div class="form-group">
            <label class="label">Extra Point Return Points</label>
            <input
              v-model="extraptsretpts"
              name="extraptsretpts"
              class="form-control"
              type="number"
            />
          </div>
          <button
            class="
              btn btn-primary btn-color btn-bg-color btn-sm
              col-xs-2
              margin-left
            "
            type="submit"
          >
            Submit
          </button>
        </form>
      </div>
    </div>
  </div>
</template>

<script>
/* eslint-disable */
export default {
  name: "LeagueSettingsAdmin",
  data() {
    return {
      leaguename: "",
      maxteams: "",
      typeofscoring: "",
      passingtdpts: "",
      passingydspts: "",
      rushingydspts: "",
      receptionspts: "",
      receivingydspts: "",
      receivingtdspts: "",
      twoptconvptsdspts: "",
      fumbleslostpts: "",
      fieldgoals019pts: "",
      fieldgoals2029pts: "",
      fieldgoals3039pts: "",
      fieldgoals4049pts: "",
      fieldgoals50pluspts: "",
      pointsallowed0pts: "",
      pointsallowed16pts: "",
      pointsallowed713pts: "",
      pointsallowed1420pts: "",
      pointsallowed2127pts: "",
      pointsallowed2834pts: "",
      pointsallowed35pluspts: "",
      sackspts: "",
      pdefinterceptionpts: "",
      fumblerecovpts: "",
      deftdpts: "",
      safetypts: "",
      blockedkickpts: "",
      specialteamstdpts: "",
      extraptsretpts: "",
    };
  },
};
</script>

<style scoped>
body {
  overflow: scroll;
}

.container w-100 p-3 h600 {
  width: 50%;
  height: 100%;
  display: inline-block;
}
</style>
