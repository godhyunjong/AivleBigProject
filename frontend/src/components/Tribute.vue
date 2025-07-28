<template>
    <div>
        <Number
            label="TributeId"
            v-model="value.tributeId"
            :editMode="editMode"
        />
        <String
            label="MemorialId"
            v-model="value.memorialId"
            :editMode="editMode"
        />
        <String
            label="Content"
            v-model="value.content"
            :editMode="editMode"
        />
        <String
            label="Keywords"
            v-model="value.keywords"
            :editMode="editMode"
        />
        <Date
            label="CreatedAt"
            v-model="value.createdAt"
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
    name: 'Tribute',
    mixins:[BaseEntity],
    components:{
    },
    
    data: () => ({
        path: "tributes",
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
