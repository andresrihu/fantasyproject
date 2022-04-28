<template>
  <div class="container w-100 p-3 h600">
    <div class="row">
      <div class="col-xs-6">
        <form action="/route" method="POST">
          <div class="form-group">
            <h2 style="text-align:center;">Admin Settings</h2>
            <label class="label">Leage Name</label>
            <input v-model="leaguename" class="form-control" type="text" />
          </div>

          <div class="form-group">
            <label class="label">Max Teams</label>
            <input v-model="maxteams" class="form-control" type="text" />
          </div>

          <div class="form-group">
            <label class="label">Type of Scoring</label>
            <input v-model="typeofscoring" class="form-control" type="text" />
          </div>

          <label class="label">Passing Touchdown Points</label>
          <div class="form-group">
            <input v-model="passingtdpts" class="form-control" type="text" />
          </div>

          <label class="label">Passing Yards Points</label>
          <div class="form-group">
            <input v-model="passingydspts" class="form-control" type="text" />
          </div>

          <label class="label">Rushing TDs Points</label>
          <div class="form-group">
            <input v-model="rushingtdspts" class="form-control" type="text" />
          </div>
          <label class="label">Rushing YDs Points</label>
          <div class="form-group">
            <input v-model="rushingydspts" class="form-control" type="text" />
          </div>
          <label class="label">Receptions Points</label>
          <div class="form-group">
            <input v-model="receptionspts" class="form-control" type="text" />
          </div>
          <label class="label">Receiving YDs Points</label>
          <div class="form-group">
            <input v-model="receivingydspts" class="form-control" type="text" />
          </div>
          <label class="label">Receiving TDs Points</label>
          <div class="form-group">
            <input v-model="receivingtdspts" class="form-control" type="text" />
          </div>
          <label class="label">Two Point Conversion Points</label>
          <div class="form-group">
            <input
              v-model="twoptconvptsdspts"
              class="form-control"
              type="text"
            />
          </div>
          <label class="label">Fumbles Lost Points</label>
          <div class="form-group">
            <input v-model="fumbleslostpts" class="form-control" type="text" />
          </div>
          <label class="label">Field Goals 0-19 Points</label>
          <div class="form-group">
            <input
              v-model="fieldgoals019pts"
              class="form-control"
              type="text"
            />
          </div>
          <label class="label">Field Goals 20-29 Points</label>
          <div class="form-group">
            <input
              v-model="fieldgoals2029pts"
              class="form-control"
              type="text"
            />
          </div>
          <label class="label">Field Goals 30-39 Points</label>
          <div class="form-group">
            <input
              v-model="fieldgoals3039pts"
              class="form-control"
              type="text"
            />
          </div>
          <label class="label">Field Goals 40-49 Points</label>
          <div class="form-group">
            <input
              v-model="fieldgoals4049pts"
              class="form-control"
              type="text"
            />
          </div>
          <label class="label">Field Goals 50+ Points</label>
          <div class="form-group">
            <input
              v-model="fieldgoals50pluspts"
              class="form-control"
              type="text"
            />
          </div>
          <label class="label">Points Allowed 0 Points</label>
          <div class="form-group">
            <input
              v-model="pointsallowed0pts"
              class="form-control"
              type="text"
            />
          </div>
          <label class="label">Points Allowed 1-6 Points</label>
          <div class="form-group">
            <input
              v-model="pointsallowed16pts"
              class="form-control"
              type="text"
            />
          </div>
          <label class="label">Points Allowed 7-13 Points</label>
          <div class="form-group">
            <input
              v-model="pointsallowed713pts"
              class="form-control"
              type="text"
            />
          </div>
          <label class="label">Points Allowed 14-20 Points</label>
          <div class="form-group">
            <input
              v-model="pointsallowed1420pts"
              class="form-control"
              type="text"
            />
          </div>
          <label class="label">Points Allowed 21-27 Points</label>
          <div class="form-group">
            <input
              v-model="pointsallowed2127pts"
              class="form-control"
              type="text"
            />
          </div>
          <label class="label">Points Allowed 28-34 Points</label>
          <div class="form-group">
            <input
              v-model="pointsallowed2834pts"
              class="form-control"
              type="text"
            />
          </div>
          <label class="label">Points Allowed 35+ Points</label>
          <div class="form-group">
            <input
              v-model="pointsallowed35pluspts"
              class="form-control"
              type="text"
            />
          </div>
          <label class="label">Sacks Points</label>
          <div class="form-group">
            <input v-model="sackspts" class="form-control" type="text" />
          </div>
          <label class="label">Interception Points</label>
          <div class="form-group">
            <input
              v-model="pdefinterceptionpts"
              class="form-control"
              type="text"
            />
          </div>
          <label class="label">Fumble Recovery Points</label>
          <div class="form-group">
            <input v-model="fumblerecovpts" class="form-control" type="text" />
          </div>
          <label class="label">Defense Touchdown Points</label>
          <div class="form-group">
            <input v-model="deftdpts" class="form-control" type="text" />
          </div>
          <label class="label">Safety Points</label>
          <div class="form-group">
            <input v-model="safetypts" class="form-control" type="text" />
          </div>
          <label class="label">Blocked Kick Points</label>
          <div class="form-group">
            <input v-model="blockedkickpts" class="form-control" type="text" />
          </div>
          <label class="label">Special Teams TDs Points</label>
          <div class="form-group">
            <input
              v-model="specialteamstdpts"
              class="form-control"
              type="text"
            />
          </div>
          <label class="label">Extra Point Return Points</label>
          <div class="form-group">
            <input v-model="extraptsretpts" class="form-control" type="text" />
          </div>
          <button
            class="btn btn-primary btn-color btn-bg-color btn-sm col-xs-2 margin-left"
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
