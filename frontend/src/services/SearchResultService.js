const axios = require('axios');

const ATHLETES_URL = 'http://localhost:8080/athletes'
const TEAMS_URL = 'http://localhost:8080/teams'
var TEAM_SEARCH_URL = 'http://localhost:8080/teams/search/'
var ATHLETE_SEARCH_URL = 'http://localhost:8080/athletes/search/'

class SearchResultService {
    async getAthletes() {
        return await axios.get(ATHLETES_URL);
    }
    async getTeams() {
        return await axios.get(TEAMS_URL);
    }
    async getTeamSearch(search) {
        return await axios.get((TEAM_SEARCH_URL + search));
    }
    async getAthleteSearch(search) {
        return await axios.get((ATHLETE_SEARCH_URL + search));
    }
}

export default new SearchResultService();