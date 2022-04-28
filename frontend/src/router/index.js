import { createRouter, createWebHistory } from 'vue-router'
import TestView from '../views/TestView.vue'
import LoginRegView from '../views/Fp-LoginRegView.vue'
import TeamInfoView from '../views/Mp-TeamInfoView.vue'
import AthleteTeamsStatsView from '../views/Mp-AthleteTeamsStatsView.vue'
import LeagueTeamInfoView from '../views/Fp-LeagueTeamInfoView.vue'
import HomeView from '../views/Mp-HomeView.vue'
import FantasyHomeView from '../views/Fp-MainView.vue'
import CreateLeague from '../views/Fp-CreateLeagueView.vue'
import AthleteInfo from '../views/Mp-AthleteInfoView.vue'
import LeagueSetting from '../views/Fp-LeagueSettingsView.vue'
import PlayerInfo from '../views/Fp-PlayerInfoView.vue'
import Draft from '../views/Fp-DraftView.vue'


const routes = [
  {
    // HOME ROUTE
    path: '/',
    name: 'homeView',
    component: HomeView
  },
  {
    // __________________________________________LOGIN AND REGISTER
    path: '/signup',
    name: 'loginreg',
    component: LoginRegView
  },
  {
    path: '/team',
    name: 'teaminfo',
    component: TeamInfoView
  },
  {
    path: '/search',
    name: 'search',
    component: AthleteTeamsStatsView
  },
  {
    path: '/leagueteam',
    name: 'leagueteam',
    component: LeagueTeamInfoView
  },

  {
    path: '/fantasyhome',
    name: 'fantasyhome',
    component: FantasyHomeView
  },
  {

    // _______________________________________________CREATE LEAGUE
    path: '/createLeague',
    name: 'creatleague',
    component: CreateLeague
  },
  {
    // ________________________________________________ATHLETE INFO
    path: '/athleteInfo',
    name: 'athleteInfo',
    component: AthleteInfo
  },
  {
    // ________________________________________________LEAGUE SETTINGS
    path: '/leagueSettings',
    name: 'leagueSetting',
    component: LeagueSetting
  },
  {
    // ________________________________________________LEAGUE SETTINGS
    path: '/viewPlayer',
    name: 'viewPlayer',
    component: PlayerInfo
  },
  {
    // ________________________________________________LEAGUE SETTINGS
    path: '/draft',
    name: 'draft',
    component: Draft
  },
  {
    path: '/test',
    name: 'testing',
    component: TestView
  }
  
  // {
  //   path: '/about',
  //   name: 'about',
  //   // route level code-splitting
  //   // this generates a separate chunk (about.[hash].js) for this route
  //   // which is lazy-loaded when the route is visited.
  //   component: () => import(/* webpackChunkName: "about" */ '../views/AboutView.vue')
  // }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
