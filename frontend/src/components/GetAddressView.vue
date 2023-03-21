<template>

    <v-data-table
        :headers="headers"
        :items="getAddress"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'GetAddressView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            getAddress : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/getAddresses'))

            temp.data._embedded.getAddresses.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.getAddress = temp.data._embedded.getAddresses;
        },
        methods: {
        }
    }
</script>

