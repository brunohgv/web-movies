<template>
  <v-container>
    <v-flex>
      <v-card>
        <v-flex sm12>
          <v-card-title>
            <div>
              <h2>Adicionar Filme</h2>
            </div>
          </v-card-title>
          <v-card-text>
            <v-form>
              <v-text-field
                v-model="movie.title"
                label="Título do Filme"
                />
              <v-textarea
                v-model="movie.description"
                label="Descrição"
                rows="5"
              ></v-textarea>
              <v-img
                :src="movie.imageUrl"
                max-height="300px"
                contain></v-img>
              <v-text-field
                v-model="movie.imageUrl"
                label="URL da imagem"
                ></v-text-field>
              <v-btn @click="registerMovie" color="success">Cadastrar</v-btn>
            </v-form>
          </v-card-text>
        </v-flex>
      </v-card>
    </v-flex>
  </v-container>
</template>

<script>
export default {
  data () {
    return {
      movie: {
        title: '',
        description: '',
        imageUrl: ''
      }
    }
  },
  methods: {
    registerMovie () {
      if (this.validate()) {
        console.log("Register")
      } else {
        console.log("error")
      }
    },
    validate () {
      if (this.movie.title !== '' && this.movie.title !== null) {
        if (this.movie.description !== '' && this.movie.description !== null) {
          if (this.movie.imageUrl !== '' && this.movie.imageUrl !== null) {
            return true
          }
        } 
      }
      return false
    }
  }
}
</script>
