<template>
    <div>
        <Number
            label="CommentId"
            v-model="value.commentId"
            :editMode="editMode"
        />
        <String
            label="MemorialId"
            v-model="value.memorialId"
            :editMode="editMode"
        />
        <Number
            label="UserId"
            v-model="value.userId"
            :editMode="editMode"
        />
        <String
            label="Content"
            v-model="value.content"
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
    name: 'Comment',
    mixins:[BaseEntity],
    components:{
    },
    
    data: () => ({
        path: "comments",
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
