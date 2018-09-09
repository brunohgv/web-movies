<template>
  <v-app>
    <v-navigation-drawer
      persistent
      :clipped="clipped"
      v-model="drawer"
      enable-resize-watcher
      fixed
      app
    >
      <v-list>
        <v-list-group
          v-for="(item, i) in itemList"
          :key="i"
          :prepend-icon="item.icon">
          <v-list-tile slot="activator">
            <v-list-tile-title>{{item.title}}</v-list-tile-title>
          </v-list-tile>

          <v-list-tile
            v-for="(subItem, j) in item.subItems"
            :key="j"
            :to="subItem.link">
            <v-list-tile-action>
              <v-icon>{{ subItem.icon }}</v-icon>
            </v-list-tile-action>
            <v-list-tile-title v-text="subItem.title"></v-list-tile-title>
          </v-list-tile>

        </v-list-group>
      </v-list>
    </v-navigation-drawer>
    <v-toolbar
      app
      :clipped-left="clipped"
    >
      <v-toolbar-side-icon @click.stop="drawer = !drawer"></v-toolbar-side-icon>
      <v-toolbar-title v-text="title"></v-toolbar-title>
      <v-spacer></v-spacer>
    </v-toolbar>
    <v-content>
      <router-view/>
    </v-content>
    <v-footer :fixed="fixed" app>
      <span>&copy; 2017</span>
    </v-footer>
  </v-app>
</template>

<script>

export default {
  name: 'App',
  data () {
    return {
      clipped: true,
      drawer: true,
      fixed: false,
      itemList: [{
        icon: 'movie',
        title: 'Filmes',
        subItems: [
          {
            icon: 'list',
            title: 'Listar Filmes',
            link: '/listmovies'
          },
          {
            icon: 'add',
            title: 'Adicionar Filme',
            link: '/addmovie'
          }
        ]
      }],
      miniVariant: false,
      right: true,
      rightDrawer: false,
      title: 'S\'TOS Movies'
    }
  }
}
</script>
