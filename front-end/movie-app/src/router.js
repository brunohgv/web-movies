import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      redirect: '/listmovies'
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
