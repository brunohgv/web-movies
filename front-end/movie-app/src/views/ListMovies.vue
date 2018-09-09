<template>
  <v-container>
    <v-flex mb-2 xs12
      v-for="(movie, i) in movies"
      :key="i">
      <v-card>
        <v-layout>
          <v-flex xs3>
            <v-img
              :src="movie.imageUrl"
              contain></v-img>
          </v-flex>
          <v-layout xs9
            align-space-around
            justify-space-between
            column>
            <v-card-title>
              <div>
                <div class="headline">{{ movie.title }}</div>
                <v-spacer></v-spacer>
                <div>{{ movie.description }}</div>
              </div>
            </v-card-title>
            <v-card-actions>
              <v-spacer></v-spacer>
              <v-btn flat color="success">Editar</v-btn>
              <v-btn flat color="error">Excluir</v-btn>
            </v-card-actions>
          </v-layout>
        </v-layout>
      </v-card>
    </v-flex>
  </v-container>
</template>

<script>
export default {
  data () {
    return {
      movies: [
        {
          title: 'Título do filme',
          description: 'Descrição do filme',
          imageUrl: 'http://placekitten.com/300/300'
        },
        {
          title: 'Título do filme',
          description: 'Descrição do filme',
          imageUrl: 'http://placekitten.com/300/300'
        }
      ]
    }
  }
}
</script>
