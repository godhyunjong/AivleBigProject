<template>
    <div>
        <Number
            label="FamilyMemberId"
            v-model="value.familyMemberId"
            :editMode="editMode"
        />
        <String
            label="MemorialId"
            v-model="value.memorialId"
            :editMode="editMode"
        />
        <String
            label="UserId"
            v-model="value.userId"
            :editMode="editMode"
        />
        <String
            label="Name"
            v-model="value.name"
            :editMode="editMode"
        />
        <String
            label="Relationship"
            v-model="value.relationship"
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
    name: 'FamilyMember',
    mixins:[BaseEntity],
    components:{
    },
    
    data: () => ({
        path: "familyMembers",
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
