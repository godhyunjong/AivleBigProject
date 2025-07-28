<template>
    <div>
        <Number
            label="MessageId"
            v-model="value.messageId"
            :editMode="editMode"
        />
        <String
            label="추천 메시지 문구"
            v-model="value.comment"
            :editMode="editMode"
        />
        <Number
            label="ServiceId1"
            v-model="value.serviceId1"
            :editMode="editMode"
        />
        <Number
            label="ServiceId2"
            v-model="value.serviceId2"
            :editMode="editMode"
        />
        <Number
            label="CustomerId"
            v-model="value.customerId"
            :editMode="editMode"
        />
        <Date
            label="CreateMessageDate"
            v-model="value.createMessageDate"
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
    name: 'RecommendMessage',
    mixins:[BaseEntity],
    components:{
    },
    
    data: () => ({
        path: "recommendMessages",
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
