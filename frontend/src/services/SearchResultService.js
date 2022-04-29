const axios = require('axios');

const API_URL = 'http://localhost:8080/athletes'

class SearchResultService {
    async getAthletes() {
        return await axios.get(API_URL);
    }
}

export default new SearchResultService();