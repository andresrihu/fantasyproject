import { createRouter, createWebHistory } from 'vue-router'
import TestView from '../views/TestView.vue'
import LoginRegView from '../views/Fp-LoginRegView.vue'
import TeamInfoView from '../views/Mp-TeamInfoView.vue'
import AthleteTeamsStatsView from '../views/Mp-AthleteTeamsStatsView.vue'

const routes = [
  {
    path: '/',
    name: 'test',
    component: TestView
  },
  {
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
