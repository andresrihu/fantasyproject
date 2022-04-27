<template>
<table class="table table-striped w-auto">
			<thead>
				<tr>
					<th><h3>Setting</h3></th>
					<th><h3>Value</h3></th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td class="text-left table w-auto small"><h3>League Name</h3></td>
					<td class="text-left"><h3>NFL Fastasy League</h3></td>
				</tr>
				<tr>
					<td class="text-left"><h3>Type of Scoring</h3></td>
					<td class="text-left"><h3>Points Only</h3></td>
				</tr>
				<tr>
					<td><h3>Passing Touchdown Points</h3></td>
					<td><h3> 4 </h3></td>
				</tr>
				<tr>
					<td><h3>Passing TD Points</h3></td>
					<td><h3>{{ passingtdpts }}</h3></td>
				</tr>
				<tr>
					<td><h3>Passing Yards Points</h3></td>
					<td><h3>{{ passingydspts }}</h3></td>
				</tr>
				<tr>
					<td><h3>Rushing TD Points</h3></td>
					<td><h3>{{ rushingtdspts }}</h3></td>
				</tr>
				<tr>
					<td><h3>Rushing Yards Points</h3></td>
					<td><h3>{{ rushingydspts }}</h3></td>
				</tr>
				<tr>
					<td><h3>Receptions</h3></td>
					<td><h3>{{ receptionspts }}</h3></td>
				</tr>
				<tr>
					<td><h3>Receiving YDs Points</h3></td>
					<td><h3>{{receivingydspts}}</h3></td>
				</tr>
				<tr>
					<td><h3>Receiving TDs Points</h3></td>
					<td><h3>{{receivingtdspts}}</h3></td>
				</tr>
				<tr>
					<td><h3>Two Point Conversion Points</h3></td>
					<td><h3> {{twoptconvptsdspts}} </h3></td>
				</tr>
				<tr>
					<td><h3>Fumbles Lost Points</h3></td>
					<td><h3>{{ fumbleslostpts }}</h3></td>
				</tr>
				<tr>
					<td><h3>Field Goals 0-19 Points</h3></td>
					<td><h3>{{ fieldgoals019pts }}</h3></td>
				</tr>
				<tr>
					<td><h3>Field Goals 20-29 Points</h3></td>
					<td><h3>{{ fieldgoals2029pts }}</h3></td>
				</tr>
				<tr>
					<td><h3>Rushing Yards Points</h3></td>
					<td><h3>{{ fieldgoals2029pts }}</h3></td>
				</tr>
				<tr>
					<td><h3>Field Goals 30-39 Points</h3></td>
					<td><h3>{{ fieldgoals3039pts }}</h3></td>
				</tr>
                <tr>
                    <td><h3>Field Goals 40-49 Points</h3></td>
					<td><h3>{{ fieldgoals4049pts }}</h3></td>
				</tr>
				<tr>
					<td><h3>Field Goals 50+ Points</h3></td>
					<td><h3>{{ fieldgoals2029pts }}</h3></td>
				</tr>
				<tr>
					<td><h3>Points Allowed 0 Pointss</h3></td>
					<td><h3>{{ pointsallowed0pts }}</h3></td>
				</tr>
				<tr>
					<td><h3>Points Allowed 1-6 Points</h3></td>
					<td><h3>{{ pointsallowed16pts }}</h3></td>
				</tr>
				<tr>
					<td><h3>Points Allowed 7-13 Pointss</h3></td>
					<td><h3>{{ pointsallowed713pts }}</h3></td>
				</tr>
				<tr>
					<td><h3>Points Allowed 14-20 Points</h3></td>
					<td><h3>{{ pointsallowed1420pts }}</h3></td>
				</tr>
                <tr>
					<td><h3>Points Allowed 21-27 Points</h3></td>
					<td><h3>{{ pointsallowed2127pts }}</h3></td>
				</tr>
				<tr>
					<td><h3>Points Allowed 28-34 Pointss</h3></td>
					<td><h3>{{ pointsallowed2834pts }}</h3></td>
				</tr>
				<tr>
					<td><h3>Points Allowed 35+ Points</h3></td>
					<td><h3>{{ pointsallowed35pluspts }}</h3></td>
				</tr>
				<tr>
					<td><h3>Field Goals 50+ Points</h3></td>
					<td><h3>{{ fieldgoals2029pts }}</h3></td>
				</tr>
				<tr>
					<td><h3>Sacks Points</h3></td>
					<td><h3>{{ sackspts }}</h3></td>
				</tr>
				<tr>
					<td><h3>Interception Pointss</h3></td>
					<td><h3>{{ pdefinterceptionpts }}</h3></td>
				</tr>
				<tr>
					<td><h3>Fumble Recovery Points</h3></td>
					<td><h3>{{ fumblerecovpts }}</h3></td>
				</tr>
				<tr>
					<td><h3>Defense Touchdown Points</h3></td>
					<td><h3>{{ deftdpts }}</h3></td>
				</tr>
                <tr>
					<td><h3>Safety Points</h3></td>
					<td><h3>{{ safetypts }}</h3></td>
				</tr>
				<tr>
					<td><h3>Special Teams TDs Points</h3></td>
					<td><h3>{{ SpecTeamsTDsPoints }}</h3></td>
				</tr>
				<tr>
					<td><h3>Extra Point Return Points</h3></td>
					<td><h3>{{ extraptsretpts }}</h3></td>
				</tr>
		
			</tbody>
</table>   

 
    
</template>

<script>
/* eslint-disable */
export default {
  name: "LeagueSettingsPlayer",
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
receivingtdspts: "20",
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
extraptsretpts: ""
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