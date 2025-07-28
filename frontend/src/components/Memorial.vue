<template>
    <div>
        <String
            label="MemorialId"
            v-model="value.memorialId"
            :editMode="editMode"
        />
        <Number
            label="CustomerId"
            v-model="value.customerId"
            :editMode="editMode"
        />
        <String
            label="ImageUrl"
            v-model="value.imageUrl"
            :editMode="editMode"
        />
        <String
            label="Name"
            v-model="value.name"
            :editMode="editMode"
        />
        <Number
            label="Age"
            v-model="value.age"
            :editMode="editMode"
        />
        <Date
            label="BirthOfDate"
            v-model="value.birthOfDate"
            :editMode="editMode"
        />
        <Date
            label="DeceasedDate"
            v-model="value.deceasedDate"
            :editMode="editMode"
        />
        <String
            label="Gender"
            v-model="value.gender"
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
    name: 'Memorial',
    mixins:[BaseEntity],
    components:{
    },
    
    data: () => ({
        path: "memorials",
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
