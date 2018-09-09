import Vue from 'vue'
import Router from 'vue-router'
import Home from './views/Home.vue'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'home',
      component: Home
    },
    {
      path: '/listmovies',
      name: 'listmovies',
      component: () => import('./views/ListMovies.vue')
    },
    {
      path: '/addmovie',
      name: 'addmovie',
      component: () => import('./views/AddMovie.vue')
    },
    {
      path: '/editmovie',
      name: 'editmovie',
      component: () => import('./views/EditMovie.vue'),
      props: true
    }
  ]
})
