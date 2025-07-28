<template>
    <div>
        <Number
            label="Documentid"
            v-model="value.documentid"
            :editMode="editMode"
        />
        <v-row class="ma-0 pa-0">
            <v-spacer></v-spacer>
            <v-btn width="64px" color="primary" @click="save">
                저장
            </v-btn>
        </v-row>
    </div>
</template>


<script>
import BaseEntity from './base-ui/BaseEntity.vue'

export default {
    name: 'DocumentFile',
    mixins:[BaseEntity],
    components:{
    },
    
    data: () => ({
        path: "documentFiles",
        value: {
        }
    }),
    created(){
    },
    computed:{
    },
    methods: {
    },
}
</script>
