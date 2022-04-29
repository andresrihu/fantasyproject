const axios = require('axios');

const ATHLETES_URL = 'http://localhost:8080/athletes'
const TEAMS_URL = 'http://localhost:8080/teams'

class SearchResultService {
    async getAthletes() {
        return await axios.get(ATHLETES_URL);
    }
    async getTeams() {
        return await axios.get(TEAMS_URL);
    }
}

export default new SearchResultService();