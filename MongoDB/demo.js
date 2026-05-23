db.createCollection("one",
    {
        validator:
        {
            $jsonSchema:
            {
                required:['name','price'],
                properties:
                {
                    name:
                    {
                    bsonType:'string',
                    description:"Must be a string and is required."
                    },
                price:
                    {
                    bsonType:'number',
                    description:"Must be a number and is required."
                    }   
                }
                
            }
        }
    }
)

db.createCollection("myt",
    {
    validator:
    {
        $jsonSchema:
        {
            required:["name","id"],
            properties:
            {
                name:
                {
                    bsonType:"string",
                description:"Must be a string and is required."
                },
                id:
                {
                    bsonType: Number,
                    description:"Must be a number and is required."
                }
            }
        }
    }
})



db.createCollection("demo",
    {
        validator:
        {
            $jsonSchema:
            {
                properties:
                {
                    name:
                    {
                        bsonType:String,
                        description:"Must be a String"
                    },
                    age:
                    {
                        bsonType:Number,
                        description:"Must be an Integer"
                    }
                }
            }
        }
    }
)
























