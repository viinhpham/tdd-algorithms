CSV files with format: 
990033333, gaceer45, click, PR1233 
990033332, gaceer45, hover, PR1233 



criteria: sessionID, event type, product id 

//Load csv file to spark context.
//sparse RDD into list of items based comma
//Filter based on: productId = items[3] and sessionID =   items[1] and eventType = item[2]
//Calculate the mean time by calculate the summary of timestamp and divide to the number of filtered records.

