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
    // __________________________________________HOME VIEW
    path: '/',
    name: 'homeView',
    component: HomeView
  },
  {
    // __________________________________________LOGIN AND REGISTER VIEW
    path: '/signup',
    name: 'loginreg',
    component: LoginRegView
  },
  {
    // __________________________________________TEAM INFO VIEW
    path: '/team/:id',
    name: 'teaminfo',
    component: TeamInfoView,
    params: true
  },
  {
    // __________________________________________ATHLETE TEAM STATS VIEW
    path: '/stats',
    name: 'stats',
    component: AthleteTeamsStatsView
  },
  {
    // __________________________________________LEAGUE TEAM INFO VIEW
    path: '/leagueteam',
    name: 'leagueteam',
    component: LeagueTeamInfoView
  },

  {
    // __________________________________________FP-MAIN VIEW
    path: '/fantasyhome',
    name: 'fantasyhome',
    component: FantasyHomeView
  },
  {
    // _______________________________________________CREATE LEAGUE VIEW
    path: '/createLeague',
    name: 'createleague',
    component: CreateLeague
  },
  {
    // ________________________________________________ATHLETE INFO VIEW
    path: '/athleteInfo/:id',
    name: 'athleteInfo',
    component: AthleteInfo,
    params: true
  },
  {
    // ________________________________________________LEAGUE SETTINGS VIEW
    path: '/leagueSettings',
    name: 'leagueSetting',
    component: LeagueSetting
  },
  {
    // ________________________________________________PLAYER INFO VIEW
    path: '/viewPlayer',
    name: 'viewPlayer',
    component: PlayerInfo
  },
  {
    // ________________________________________________DRAFT VIEW
    path: '/draft',
    name: 'draft',
    component: Draft
  },
  {
    // ________________________________________________TEST VIEW
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
