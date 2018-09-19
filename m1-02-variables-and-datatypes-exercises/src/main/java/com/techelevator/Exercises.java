package com.techelevator;

public class Exercises {

	public static void main(String[] args) {
        
        /*
        INSTRUCTIONS

        The primary purposes of these exercises are to practice: 
        		
        		1. declaring variables and using assignment statements
        		2. using variables, literals, and operators within arithmetic expressions
        		3. choosing meaningful variable names
        		4. choosing appropriate data types

        One of the hardest things about programming is choosing good names. Spend time
        to find good, meaningful, and descriptive names for your variables. Clarity and
        expressiveness is more important than brevity. Err on the side of longer, more 
        descriptive names over short, cryptic ones.

        Be consistent with your choice of datatypes, especially when it comes to 
        some values like money. There are many different ways to express money. Pick one, 
        and stick with it throughout these exercises.
        
        Keep your code consistent and well formatted. When code is poorly indented, 
        or lost in a flood of blank lines, it can make it difficult to read. 
        */

        /* 
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch? 
        */
		
		// ### EXAMPLE:  
		int initialNumberOfBirds = 4;
		int birdsThatFlewAway = 1;
		int remainingNumberOfBirds = initialNumberOfBirds - birdsThatFlewAway;

        /* 
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests? 
        */
		
		// ### EXAMPLE: 
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;

        /* 
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods? 
        */
         
		       int raccoonsInWoods = 3;
		       int raccoonsAtHome = 2;
		       int remainingRacoons = raccoonsInWoods - raccoonsAtHome;
		       System.out.println(remainingRacoons);
		
        /* 
        4. There are 5 flowers and 3 bees. How many less bees than flowers? 
        */
               int numberOfFlowers = 5;
               int numberOfBees = 3;
               int numberOfExtraFlowers = numberOfFlowers - numberOfBees;
		       System.out.println(numberOfExtraFlowers);
               
        /* 
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now? 
        */
               int lonelyPigeeonEatingBreadcrumbs = 1;
               int anotherPigeonEatingBreadcrumbs = 1;
               int numberOfPigeonEatingBreadcrumbs = lonelyPigeeonEatingBreadcrumbs + anotherPigeonEatingBreadcrumbs;
		       System.out.println(numberOfPigeonEatingBreadcrumbs);

        /* 
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now? 
        */
               int owlsSittingOnTheFence = 3;
               int owlsJoined = 2;
               int numberOfOwlsSittingOnTheFence = owlsSittingOnTheFence + owlsJoined;
               System.out.println(numberOfOwlsSittingOnTheFence);
               /* 
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home? 
        */
               int numberOfBeaversWorking = 2;
               int numberOfBeaverLeft = 1;
               int remainingBeaversWorking = numberOfBeaversWorking + numberOfBeaverLeft;
               System.out.println(remainingBeaversWorking);
        /* 
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all? 
        */
                int toucansSittingOnTreeLimb = 2;
                int toucanJoinedSittingOnTreeLimb = 1;
                int totalNumberOfToucans = toucansSittingOnTreeLimb + toucanJoinedSittingOnTreeLimb;
                System.out.println(totalNumberOfToucans);
        /* 
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts? 
        */
                int numberOfSquirrels = 4;
                int numberOfNuts = 2;
                int numberOfExtraSquirrels = numberOfSquirrels + numberOfNuts;
                System.out.println(numberOfExtraSquirrels);
        /* 
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find? 
        */
                int quarter = 25;
                int dime = 10;
                int nickels = 5;
                int totalMoneyFound = quarter + dime + nickels;
                System.out.println(totalMoneyFound);
        /* 
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all? 
        */
                 int hiltBakedMuffins = 18;
                 int macAdamsBakedMuffins = 20;
                 int flanneryBakedMuffins = 17;
                 int totalBakedMuffins = hiltBakedMuffins + macAdamsBakedMuffins + flanneryBakedMuffins;
                 System.out.println(totalBakedMuffins);
        /*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
                 double priceOfYoyo = 0.24;
                 double priceOfWhistle = 0.14;
                 double priceOfTotalToys = priceOfYoyo + priceOfWhistle;
                 System.out.println(totalBakedMuffins);
        /*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
                 int largeMarshmallows = 8;
                 int miniMarshmallows = 10;
                 int totalNumberOfMarshmallows = largeMarshmallows + miniMarshmallows;
                 System.out.println(totalNumberOfMarshmallows);
        
        /*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
                 int hiltSnowLevel = 29;
                 int BrecknockSnowLevel = 17;
                 int hiltExtraLevelOfSnow = hiltSnowLevel - BrecknockSnowLevel;
                 System.out.println(hiltExtraLevelOfSnow);
             
        /*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
                 int amountOfMoneyBefore = 10;
                 int moneySpentOnToyTruck = 3;
                 int moneySpentOnPencil = 2;
                 int totalMoneyLeft = amountOfMoneyBefore - moneySpentOnToyTruck - moneySpentOnPencil;
                 System.out.println(hiltExtraLevelOfSnow);
                 
        
        /*
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
                 int joshMarblesBefore = 16;
                 int marblesLost = 7;
                 int numberOfMarblesLeft =  joshMarblesBefore - marblesLost;
                 System.out.println(numberOfMarblesLeft);
        
        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
                 int seashellsMeganHas = 19;
                 int totalNumberOfSeashellsInCollection = 25;
                 int seashellsMeganNeedToFind = totalNumberOfSeashellsInCollection - seashellsMeganHas;
                 System.out.println(seashellsMeganNeedToFind);
        
        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
                 int totalNumberOfBalloons = 17;
                 int numberOfRedBalloons = 8;
                 int numberOfGreenBalloons = totalNumberOfBalloons - numberOfRedBalloons;
                 System.out.println(numberOfGreenBalloons);
        
        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
                 int initialNumberOfBooksOnShelf = 38;
                 int extraBooksAddedToShelf = 10;
                 int totalNumberOfBooksOnShelf = initialNumberOfBooksOnShelf + extraBooksAddedToShelf;
                 System.out.println(totalNumberOfBooksOnShelf);
        
        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
                 int numberOfLegsOfOneBee = 6;
                 int numberOfLegsOfEightBees =  numberOfLegsOfOneBee * 8;
                 System.out.println(numberOfLegsOfEightBees);
          
        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
                 double priceOfIceCreamCone = 0.99;
                 double priceOfTwoIceCreamCone = priceOfIceCreamCone * 2;
                 System.out.println(priceOfTwoIceCreamCone);
        
        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
                 int totalNumberOfRocks = 125;
                 int numberOfAvailableRocks = 64;
                 int numberOfRocksNeeded = totalNumberOfRocks - numberOfAvailableRocks;
                 System.out.println(numberOfRocksNeeded);
                 
        
        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
                 int marblesBefore = 38;
                 int numberOfMarblesLost = 15;
                 int marblesLeft = marblesBefore - marblesLost;
                 System.out.println(marblesLeft);
        
        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
                 int totalMilesToDrive = 78;
                 int milesDriven = 32;
                 int milesToDrive = totalMilesToDrive - milesDriven;
                 System.out.println(marblesLeft);
        
        /*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */
                 int shovelingTimeInTheMorning = 90;
                 int shovelingTimeInTheAfternoon = 45;
                 int totalTimeShoveling = shovelingTimeInTheMorning + shovelingTimeInTheAfternoon;
                 System.out.println(marblesLeft);
        
        /*    
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
                 double priceOfOneHotDog = 0.50;
                 double priceOfSixHotDogs = priceOfOneHotDog * 6;
                 System.out.println(priceOfSixHotDogs);
        
        /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
                 int totalMoney = 50;
                 int priceOfPencil = 7;
                 int numberOfPencilsToBuy = totalMoney / priceOfPencil;
                 System.out.println(numberOfPencilsToBuy);
        
        /*    
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
                 int numberOfTotalButterflies = 33;
                 int numberOfOrangeButterflies = 20;
                 int numberOfRedButterflies = numberOfTotalButterflies - numberOfOrangeButterflies;
                 System.out.println(numberOfRedButterflies);
        
        /*    
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
                 int givenMoneyToClerk = 100;
                 int priceOfCandy = 54;
                 int changeToKate = givenMoneyToClerk - priceOfCandy;
                 System.out.println(changeToKate);
        
        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
                 int initialnumberOfTreesInBackyard = 13;
                 int numberOfExtraTreesPlanted = 12;
                 int totalnumberOfTreesInBackyard = initialnumberOfTreesInBackyard + numberOfExtraTreesPlanted;
                 System.out.println(totalnumberOfTreesInBackyard);
        
        /*    
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
                 int numberOfHoursInOneDay = 24;
                 int numberOfHoursInTwoDays = numberOfHoursInOneDay * 2;
                 System.out.println(numberOfHoursInTwoDays);
        
        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
                 int numberOfcousins = 4;
                 int numberOfGumsToEachCousin = 5;
                 int numberOfGumsNeeded = numberOfcousins * numberOfGumsToEachCousin;
                 System.out.println(numberOfGumsNeeded);
        
        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
                 float moneyDanHas = 3.00f;
                 float priceOfCandyBar = 1.00f;
                 float moneyDanLeftWith = moneyDanHas - priceOfCandyBar;
                 System.out.println(moneyDanLeftWith);
        /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
                 int numberOfBoatsInTheLake = 5;
                 int numberOfPeopleEachBoatHas = 3;
                 int totalNumberOfPeopleOnBoats = numberOfBoatsInTheLake * numberOfPeopleEachBoatHas;
                 System.out.println(totalNumberOfPeopleOnBoats);
        
        /*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
                 int numberOfLegosBefore = 380;
                 int numberOfLegosLost = 57;
                 int numberOfLegosLeft = numberOfLegosBefore - numberOfLegosLost;
                 System.out.println(numberOfLegosLeft);
                 
        /*
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
                 int initialNumberOfBakedMuffins = 35;
                 int totalNumberOfMuffinsToBake = 83;
                 int numberOfMuffinsNeeded = totalNumberOfMuffinsToBake -  initialNumberOfBakedMuffins;
                 System.out.println(numberOfMuffinsNeeded);
        
        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
                 int numberOfCrayonsWillyHas = 1400;
                 int numberOfCrayonsLucyHas = 290;
                 int numberOfExtraCrayonsWillyHas = numberOfCrayonsWillyHas - numberOfCrayonsLucyHas;
                 System.out.println(numberOfExtraCrayonsWillyHas);
        
        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
                 int numberOfStickersOnSinglePage = 10;
                 int numberOfPages = 22;
                 int numberOfTotalStickersOnPages = numberOfStickersOnSinglePage * numberOfPages;
                 System.out.println(numberOfTotalStickersOnPages);
        
        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
                 int numberOfCupcakes = 96;
                 int numberOfChildren = 8;
                 int numberOfCupcakesForEachChild = numberOfCupcakes / numberOfChildren;
                 System.out.println(numberOfCupcakesForEachChild);
        
        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */
                 int totalNumberOfCookies = 47;
                 int numberOfCookiesEachJarContains = 6;
                 int numberOfCookiesNotPlacedInJar = totalNumberOfCookies % numberOfCookiesEachJarContains;
                 System.out.println(numberOfCookiesNotPlacedInJar);
        
        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received an equal number of croissants,
        how many will be left with Marian?
        */
                 int numberOfCroissants = 59;
                 int numberOfNeighbours = 8;
                 int remainiingCroissants = numberOfCroissants % numberOfNeighbours;
                 System.out.println(remainiingCroissants);
                 
        
        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
                 int numberOfCookiesOnATray = 12;
                 int numberOfOatmealPrepared = 276;
                 int numberOfTrayNeeded = numberOfOatmealPrepared / numberOfCookiesOnATray;
                 System.out.println(numberOfTrayNeeded);
        
        /*
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
                 int numberOfPreparedPretzels = 480;
                 int numberOfPretzelPerServing = 12;
                 int numberOfTotalServings = numberOfPreparedPretzels / numberOfPretzelPerServing;
                 System.out.println(numberOfTotalServings);
        
        /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
                 int totalCupcakesBaked = 53;
                 int cupcakesLeftAtHome = 2;
                 int numberOfCupcakesToDistribute = totalCupcakesBaked - cupcakesLeftAtHome;
                 int numberOfCupcakesInEachBox = 3;
                 int numberOfBoxesGivenAway = numberOfCupcakesToDistribute / numberOfCupcakesInEachBox;
                 System.out.println(numberOfBoxesGivenAway);
        
        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
                 int carrotSticksPrepared = 74;
                 int numberOfPeople = 12;
                 int numberOfCarrotSticksUneaten = carrotSticksPrepared % numberOfPeople;
                 System.out.println(numberOfCarrotSticksUneaten);
        
        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
                 int totalNumberOfTeddyBears = 98;
                 int numberOfTeddyBearInEachShelf = 7;
                 int numberOfShelvesFilled = totalNumberOfTeddyBears / numberOfTeddyBearInEachShelf;
                 System.out.println(numberOfShelvesFilled);
        
        /*
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
                 int totalNumberOfPictures = 480;
                 int numberOfPicturesInAnAlbum = 20;
                 int numberOfAlbumsNeeded = totalNumberOfPictures / numberOfPicturesInAnAlbum;
                 System.out.println(numberOfAlbumsNeeded);
        
        /*
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
                 int totalNumberOfCards = 94;
                 int numberOfCardABoxCanHold = 8;
                 int numberOfBoxesFilled = totalNumberOfCards / numberOfCardABoxCanHold;
                 int numberOfCardsInUnfilledBox = totalNumberOfCards % numberOfCardABoxCanHold;
                 System.out.println(numberOfBoxesFilled);
                 System.out.println(numberOfCardsInUnfilledBox);
        
        /*
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
                 int totalNumberOfBooks = 210;
                 int numberOfShelves = 10;
                 int numberOfBooksInEachShelf = totalNumberOfBooks / numberOfShelves;
                 System.out.println(numberOfBooksInEachShelf);

        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
                 int numberOfCroissantsToBeServed = 17;
                 int numberOfGuests = 7;
                 int numberOfCroissantsForEachGuest = numberOfCroissantsToBeServed / numberOfGuests;
                 System.out.println(numberOfCroissantsForEachGuest);

        /*
            CHALLENGE PROBLEMS
        */
        
        /*
        Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages 
        1.90 hours. How long will it take the two painter working together to paint 5 12 x 14 rooms?
        Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
        Challenge: How many days will it take the pair to paint 623 rooms assuming they work 8 hours a day?.
        */
                 int wallHeight = 12;
                 int wallWidth = 14;
                 int roomCircumference = 2 * (wallHeight + wallWidth);
                 double billTime = 2.15;
                 double jillTime = 1.90;
                 double billHourlyRate = roomCircumference / billTime;
                 double jillHourlyRate =  roomCircumference / jillTime;
                 double combinedHourlyRate = billHourlyRate + jillHourlyRate;
                 int WallsToBePainted = roomCircumference * 5;
                 double timeTakenToPaintTogether = WallsToBePainted /  combinedHourlyRate;
                 int totalRoomsTobePainted = 623;
                 
                 //divide the hour result by 8 to obtain number of days taken to paint
                 double daysTakenforThePairToPaintTotalRooms = ((totalRoomsTobePainted * roomCircumference) / combinedHourlyRate) / 8;
                 
                 System.out.println(daysTakenforThePairToPaintTotalRooms);
                 

        /*
        Create and assign variables to hold your first name, last name, and middle initial. Using concatenation,
        build an additional variable to hold your full name in the order of last name, first name, middle initial. The
        last and first names should be separated by a comma followed by a space, and the middle initial must end
        with a period.
        Example: "Hopper, Grace B." 
        */
                 String firstName = "Ahmed";
                 String lasttName = "Ahmed";
                 String middleInitial = "N";
                 String fullName = lasttName +", " + firstName + " " + middleInitial + ".";
                 
                 System.out.println(fullName);
                 

        /*
        The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles. 
        What percentage of the trip has been completed?
        Hint: The percent completed is the miles already travelled divided by the total miles.
        Challenge: Display as an integer value between 0 and 100 using casts.
        */
                 int NewYorkToChicagoDistance = 800;
                 int distanceTravelled = 537;
                 int percentageOfTripCompleted = (int) ((double) distanceTravelled  / (double) NewYorkToChicagoDistance  * 100);
                 
                 System.out.println(percentageOfTripCompleted);
                 
 
            
	}

}
