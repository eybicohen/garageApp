<template>
  <v-app>
    <v-app-bar
      absolute
      color="#6A76AB"
      dark
      shrink-on-scroll
      prominent
      src="https://images.pexels.com/photos/4488637/pexels-photo-4488637.jpeg?auto=compress&cs=tinysrgb&w=600"
      fade-img-on-scroll
      scroll-target="#scrolling-techniques-3"
    >
      <template v-slot:img="{ props }">
        <v-img
          v-bind="props"
          gradient="to top right, rgba(100,115,201,.7), rgba(25,32,72,.7)"
        ></v-img>
      </template>

      <v-col class="offset-4">
        <v-app-bar-title
          style="font-size: 63px; font-family: Cursive"
          class="ml-16"
          >GarageApp</v-app-bar-title
        >
      </v-col>
      <v-spacer></v-spacer>

      <v-btn icon>
        <v-icon>mdi-magnify</v-icon>
      </v-btn>

      <v-btn icon>
        <v-icon>mdi-heart</v-icon>
      </v-btn>

      <v-btn icon>
        <v-icon>mdi-dots-vertical</v-icon>
      </v-btn>

      <v-app-bar-nav-icon></v-app-bar-nav-icon>

      <template v-slot:extension>
        <v-tabs align-left>
          <v-tab>Tab 1</v-tab>
          <v-tab>Tab 2</v-tab>
        </v-tabs>
      </template>
    </v-app-bar>
    <MainPage style="margin-top:35vh" />
  </v-app>
</template>

<script>
import MainPage from "./components/MainPage.vue";

export default {
  name: "App",
  data: () => ({
    //
  }),
  components: { MainPage },
};
</script>
