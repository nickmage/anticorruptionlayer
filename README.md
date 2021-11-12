Input sample:
```json
{
  "serviceStationName": "Jaguar / Land Rover Service Dept. #452",
  "location": "Bramingham str. 4, Lestershire, UK",
  "serviceCode": "AB0941C9V0G9H75J4B8GV12H4FNLJ",
  "orderDate": "11.11.2021",
  "sparePartsOrder": {
    "brakes": [
      {
        "manufacturer": "Bosch",
        "model": "B103/42-53",
        "vendorCode": "B81JFS90VV34",
        "quantity": 4
      }
    ],
    "waterPump": [
      {
        "manufacturer": "Jaguar",
        "model": "JLR/wp/75-320/2-20",
        "vendorCode": "J9DFJ58BLDA4RF",
        "quantity": 2
      }
    ],
    "shortBlock": [
      {
        "manufacturer": "Land Rover",
        "model": "JLR/sb/60-v54/107",
        "vendorCode": "LR23023OGRBD85",
        "quantity": 1
      }
    ],
    "crankshaft": [
      {
        "manufacturer": "Land Rover",
        "model": "JLR/c/n23/hn",
        "vendorCode": "LR37SDG3G9FVA",
        "quantity": 1
      }
    ],
    "connectingRod": [
      {
        "manufacturer": "Land Rover",
        "model": "JLR/cr/mfy-320-2",
        "vendorCode": "LRV930VFAF3A0",
        "quantity": 8
      }
    ],
    "piston": [
      {
        "manufacturer": "Land Rover",
        "model": "JLR/pt/ft1-mt6d/n",
        "vendorCode": "LRPT840F4JZ92",
        "quantity": 8
      },
      {
        "manufacturer": "Ford",
        "model": "p2-31fg",
        "vendorCode": "F83BN235V6A25MH",
        "quantity": 4
      }
    ]
  }
}
```
will return such output:
```json
{
    "service": "Jaguar / Land Rover Service Dept. #452 - Bramingham str. 4, Lestershire, UK",
    "customerId": "AB0941C9V0G9H75J4B8GV12H4FNLJ",
    "orderAcceptanceDate": "12.11.2021",
    "orderType": "Regular",
    "order": [
        {
            "type": "brakes",
            "model": "Bosch B103/42-53",
            "internalId": "B81JFS90VV34",
            "quantity": 4
        },
        {
            "type": "waterPump",
            "model": "Jaguar JLR/wp/75-320/2-20",
            "internalId": "J9DFJ58BLDA4RF",
            "quantity": 2
        },
        {
            "type": "shortBlock",
            "model": "Land Rover JLR/sb/60-v54/107",
            "internalId": "LR23023OGRBD85",
            "quantity": 1
        },
        {
            "type": "crankshaft",
            "model": "Land Rover JLR/c/n23/hn",
            "internalId": "LR37SDG3G9FVA",
            "quantity": 1
        },
        {
            "type": "connectingRod",
            "model": "Land Rover JLR/cr/mfy-320-2",
            "internalId": "LRV930VFAF3A0",
            "quantity": 8
        },
        {
            "type": "piston",
            "model": "Land Rover JLR/pt/ft1-mt6d/n",
            "internalId": "LRPT840F4JZ92",
            "quantity": 8
        },
        {
            "type": "piston",
            "model": "Ford p2-31fg",
            "internalId": "F83BN235V6A25MH",
            "quantity": 4
        }
    ]
}
```