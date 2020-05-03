package project;

import java.io.IOException;

class fillData {

    static scenario6 s6 = new scenario6();

    public static void fillDescription() {
        System.out.println("This game is about 5 people trying to steal from a jewelry store named Bill,Mark,Mason,Jack and David.But while stealing suddenly one of them kills the dealer and the whole plan changes,Your task is to find the murderer.");
    }

    public static void fillLastQuestion() {
        System.out.println("Who do you think the murderer is?");
    }

    public static void fillGuess() {
        //1th scenario Guess                                                                                                                                                                                
        scenarioManager.s1.gArray[0] = "actually it was a long time since me and my fiancÃ© wanted to get married but we couldnâ€™t afford the money, so this was a really good chance.";
        scenarioManager.s1.gArray[1] = "nth special";
        scenarioManager.s1.gArray[2] = "Jack and David were talking about their plan while they were in my cab and I heard about it and threatened them to join them.";
        scenarioManager.s1.gArray[3] = "by destiny!";
        scenarioManager.s1.gArray[4] = "I heard a shoot sound while i was in my car and i have no idea who killed the dealer!";
        scenarioManager.s1.gArray[5] = "I'm not sure.";
        scenarioManager.s1.gArray[6] = "Mark, obviously.";
        scenarioManager.s1.gArray[7] = "Bill.";
        scenarioManager.s1.gArray[8] = "I trusted my guts!";
        scenarioManager.s1.gArray[9] = "Easily";
        scenarioManager.s1.gArray[10] = "after the shoot sound, we all lost track of our plan and during that moment the cops suddenly arrived.They are really fast.";
        scenarioManager.s1.gArray[11] = "By accident";
        scenarioManager.s1.gArray[12] = "Jack, I guess.";
        scenarioManager.s1.gArray[13] = "Me!";
        //2th scenario Guess
        scenarioManager.s2.gArray[0] = "I am a hacker and obviously I wanted to earn some money.";
        scenarioManager.s2.gArray[1] = "nth";
        scenarioManager.s2.gArray[2] = "First Jack sent me a message and we met each other and talked and â€¦";
        scenarioManager.s2.gArray[3] = "by chance";
        scenarioManager.s2.gArray[4] = "Mason, he is totally out of mind!";
        scenarioManager.s2.gArray[5] = "Me!";
        scenarioManager.s2.gArray[6] = "Me, obviously!";
        scenarioManager.s2.gArray[7] = "Me!";
        scenarioManager.s2.gArray[8] = "itâ€™s been a while.";
        scenarioManager.s2.gArray[9] = "From yesterday!!!";
        scenarioManager.s2.gArray[10] = "because it was located in a not crowded alley.";
        scenarioManager.s2.gArray[11] = "just randomly!";
        scenarioManager.s2.gArray[12] = "Mason shot that guy and he didnâ€™t let us to escape.It was the worst situation.";
        scenarioManager.s2.gArray[13] = "Because of Me!";

        //3th scenario Guess
        scenarioManager.s3.gArray[0] = "actually I wanted to rob without being trapped and I suddenly found this cool people and I said why not? And I could also get my sons patronage!";
        scenarioManager.s3.gArray[1] = "nth!";
        scenarioManager.s3.gArray[2] = "I met David in prison, after  I got free one day I saw him out of the blue and we got into talking and we decided to do this and we found Mark on social media and the other were the friends of those two.";
        scenarioManager.s3.gArray[3] = "by chance!!";
        scenarioManager.s3.gArray[4] = "Dumb Mason!";
        scenarioManager.s3.gArray[5] = "Me!";
        scenarioManager.s3.gArray[6] = "Mark, obviously.";
        scenarioManager.s3.gArray[7] = "Me!";
        scenarioManager.s3.gArray[8] = "I didnâ€™t want to let Mason kill him, so I tried to stop him that the gun fell near me.";
        scenarioManager.s3.gArray[9] = "I have no idea!";
        scenarioManager.s3.gArray[10] = "because of Masonâ€™s hat that fell and he was afraid that the dealer might recognize him, so he shot him and because of the shooting sound people called you.";
        scenarioManager.s3.gArray[11] = "Because of David!";
        scenarioManager.s3.gArray[12] = "At first me and David wanted to take it all, after that I decided to take it all and kill David!";
        scenarioManager.s3.gArray[13] = "I wanted to take it all:)";
        //4th scenario Guess
        scenarioManager.s4.gArray[0] = "I had no other purpose except money to make my abs bigger.";
        scenarioManager.s4.gArray[1] = "nth.";
        scenarioManager.s4.gArray[2] = "I had no other purpose except money to make my abs bigger.";
        scenarioManager.s4.gArray[3] = "by purpose";
        scenarioManager.s4.gArray[4] = "Jack killed him. He didnâ€™t want us to get trapped.";
        scenarioManager.s4.gArray[5] = "Me!";
        scenarioManager.s4.gArray[6] = "itâ€™s been a while.";
        scenarioManager.s4.gArray[7] = "From yesterday";
        scenarioManager.s4.gArray[8] = "after Jack killed that guy Mark got shocked and didnâ€™t let anyone escape and while that the cops arrived.";
        scenarioManager.s4.gArray[9] = "Because of our bad fate!";
        scenarioManager.s4.gArray[10] = "Markâ€™s hand touched my head and thatâ€™s why.";
        scenarioManager.s4.gArray[11] = "Don't know!";
        scenarioManager.s4.gArray[12] = "oh I didnt notice that.Damn it!";
        scenarioManager.s4.gArray[13] = "Don't know!";
        //5th scenario Guess
        scenarioManager.s5.gArray[0] = "actually I really didnâ€™t want to rob again but Jack egged me on and besides that it was a great deal of money.";
        scenarioManager.s5.gArray[1] = "nth!";
        scenarioManager.s5.gArray[2] = "I knew Jack from the prison.";
        scenarioManager.s5.gArray[3] = "I knew Jack from nursery!";
        scenarioManager.s5.gArray[4] = "Mason, that nasty troublemaker.";
        scenarioManager.s5.gArray[5] = "Me!";
        scenarioManager.s5.gArray[6] = "Mark, obviously.";
        scenarioManager.s5.gArray[7] = "Me!";
        scenarioManager.s5.gArray[8] = "I think so, but this was a bad idea because Iâ€™m so slow and stupid!";
        scenarioManager.s5.gArray[9] = "Don't know!";
        scenarioManager.s5.gArray[10] = "After people heard the shooting sound they quickly called the cops and Mark didnâ€™t let us to escape and we got totally busted.";
        scenarioManager.s5.gArray[11] = "By bad timing!";
        scenarioManager.s5.gArray[12] = "Jack and me. What a Bigs mistake.";
        scenarioManager.s5.gArray[13] = "just me!";
        //
    }

    public static void fillQuestion() {
        /* //First Phase
            //1th scenario questions
            scenarioManager.s1.qArray[0] = "1.What was the purpose of your robbery?";
            scenarioManager.s1.qArray[1] = "2.How did you meet each other?";
            scenarioManager.s1.qArray[2] = "3.Who killed the dealer?";
            scenarioManager.s1.qArray[3] = "4.Who destroyed the security system?";
            scenarioManager.s1.qArray[4] = "5.How did you trust these people?";
            scenarioManager.s1.qArray[5] = "6.Why did you get trapped?";
            scenarioManager.s1.qArray[6] = "7.Who planned this whole robbery?";
            //2th scenario questions
            scenarioManager.s2.qArray[0] = "1.What was the purpose of your robbery?";
            scenarioManager.s2.qArray[1] = "2.How did you meet each other?";
            scenarioManager.s2.qArray[2] = "3.Who killed the dealer?";
            scenarioManager.s2.qArray[3] = "4.Who destroyed the security system?";
            scenarioManager.s2.qArray[4] = "5.From when do you have the plan of robbing in mind?";
            scenarioManager.s2.qArray[5] = "6.Why did you choose this store to steal from?";
            scenarioManager.s2.qArray[6] = "7.Why did you get trapped?";
            //3th scenario questions
            scenarioManager.s3.qArray[0] = "1.What was the purpose of your robbery?";
            scenarioManager.s3.qArray[1] = "2.How did you meet each other?";
            scenarioManager.s3.qArray[2] = "3.Who killed the dealer?";
            scenarioManager.s3.qArray[3] = "4.Who destroyed the security system?";
            scenarioManager.s3.qArray[4] = "5.Why was the gun near to you?";
            scenarioManager.s3.qArray[5] = "6.Why did you get trapped again?";
            scenarioManager.s3.qArray[6] = "7.How did you want to share the money?";
            //4th scenario questions
            scenarioManager.s4.qArray[0] = "1.What was the purpose of your robbery?";
            scenarioManager.s4.qArray[1] = "2.How did you meet each other?";
            scenarioManager.s4.qArray[2] = "3.Who killed the dealer?";
            scenarioManager.s4.qArray[3] = "4.From when do you have the plan of robbing in mind?";
            scenarioManager.s4.qArray[4] = "5.Why did you get trapped?";
            scenarioManager.s4.qArray[5] = "6.Why did your hat fell?";
            scenarioManager.s4.qArray[6] = "7.Why didn’t you use your strength to escape?";
            //5th scenario questions
            scenarioManager.s5.qArray[0] = "1.What was the purpose of your robbery?";
            scenarioManager.s5.qArray[1] = "2.How did you meet each other?";
            scenarioManager.s5.qArray[2] = "3.Who killed the dealer?";
            scenarioManager.s5.qArray[3] = "4.Who destroyed the security system?";
            scenarioManager.s5.qArray[4] = "5.They wanted you because of your talent?";
            scenarioManager.s5.qArray[5] = "6.Why did you get trapped?";
            scenarioManager.s5.qArray[6] = "7.Who planned this whole robbery?";
         */
        //6th scenario questions
        s6.qArray[0] = "1.Are all of the criminals saying the truth?";
        s6.qArray[1] = "2.Is this a story or what?";
        s6.qArray[2] = "3.Do you ever feel like a plastic bag?";
        s6.qArray[3] = "4.Who runs the world?";
        s6.qArray[4] = "5.Do you want to build a snowman?";
        s6.qArray[5] = "6.Who's your favorite criminal?";
        s6.qArray[6] = "7.How deep is your love?";
        //
        try {
            fileData.readQuestion1();
            fileData.readQuestion2();
            fileData.readQuestion3();
            fileData.readQuestion4();
            fileData.readQuestion5();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void fillAnswer() {
        //1th scenario answers BILL //First Phase
        /* scenarioManager.s1.aArray[0] = "actually it was a long time since me and my fiancé wanted to get married but we couldn’t afford the money, so this was a really good chance.";
            scenarioManager.s1.aArray[1] = "Jack and David were talking about their plan while they were in my cab and I heard about it and threatened them to join them.";
            scenarioManager.s1.aArray[2] = "I heard a shoot sound while i was in my car and i have no idea who killed the dealer!";
            scenarioManager.s1.aArray[3] = "Mark, obviously.";
            scenarioManager.s1.aArray[4] = "I trusted my guts!";
            scenarioManager.s1.aArray[5] = "after the shoot sound, we all lost track of our plan and during that moment the cops suddenly arrived.They are really fast.";
            scenarioManager.s1.aArray[6] = "Jack, I guess.";
            2th scenario answers Mark
            scenarioManager.s2.aArray[0] = "I am a hacker and obviously I wanted to earn some money.";
            scenarioManager.s2.aArray[1] = "First Jack sent me a message and we met each other and talked and …";
            scenarioManager.s2.aArray[2] = "Mason, he is totally out of mind!";
            scenarioManager.s2.aArray[3] = "Me, obviously!";
            scenarioManager.s2.aArray[4] = "it’s been a while.";
            scenarioManager.s2.aArray[5] = "because it was located in a not crowded alley.";
            scenarioManager.s2.aArray[6] = "Mason shot that guy and he didn’t let us to escape.It was the worst situation.";
            //3th scenario answers Jack
            scenarioManager.s3.aArray[0] = "actually I wanted to rob without being trapped and I suddenly found this cool people and I said why not? And I could also get my sons patronage!";
            scenarioManager.s3.aArray[1] = "I met David in prison, after  I got free one day I saw him out of the blue and we got into talking and we decided to do this and we found Mark on social media and the other were the friends of those two.";
            scenarioManager.s3.aArray[2] = "Dumb Mason!";
            scenarioManager.s3.aArray[3] = "Mark, obviously.";
            scenarioManager.s3.aArray[4] = "I didn’t want to let Mason kill him, so I tried to stop him that the gun fell near me.";
            scenarioManager.s3.aArray[5] = "because of Mason’s hat that fell and he was afraid that the dealer might recognize him, so he shot him and because of the shooting sound people called you.";
            scenarioManager.s3.aArray[6] = "At first me and David wanted to take it all, after that I decided to take it all and kill David!";
            //4th scenario answers Mason
            scenarioManager.s4.aArray[0] = "I had no other purpose except money to make my abs bigger.";
            scenarioManager.s4.aArray[1] = "I knew Mark from the bar.";
            scenarioManager.s4.aArray[2] = "Jack killed him. He didn’t want us to get trapped.";
            scenarioManager.s4.aArray[3] = "it’s been a while.";
            scenarioManager.s4.aArray[4] = "after Jack killed that guy Mark got shocked and didn’t let anyone escape and while that the cops arrived.";
            scenarioManager.s4.aArray[5] = "Mark’s hand touched my head and that’s why.";
            scenarioManager.s4.aArray[6] = "oh I didn’t notice that.Damn it!";
            //5th scenario answers David
            scenarioManager.s5.aArray[0] = "actually I really didn’t want to rob again but Jack egged me on and besides that it was a great deal of money.";
            scenarioManager.s5.aArray[1] = "I knew Jack from the prison.";
            scenarioManager.s5.aArray[2] = "Mason, that nasty troublemaker.";
            scenarioManager.s5.aArray[3] = "Mark, obviously.";
            scenarioManager.s5.aArray[4] = "I think so, but this was a bad idea because I’m so slow and stupid!";
            scenarioManager.s5.aArray[5] = "After people heard the shooting sound they quickly called the cops and Mark didn’t let us to escape and we got totally busted. ";
            scenarioManager.s5.aArray[6] = "Jack and me. What a Bigs mistake.";
         */
        //6th scenario answers
        s6.aArray[0] = "Not sure!:)";
        s6.aArray[1] = "Kind of...";
        s6.aArray[2] = "drifting through the wind:D";
        s6.aArray[3] = "Girls:)";
        s6.aArray[4] = "Come on, let's go and play:/ ";
        s6.aArray[5] = "Maybe Mark.";
        s6.aArray[6] = "Like the ocean, I guess.";
        try {
            fileData.readAnswer1();
            fileData.readAnswer2();
            fileData.readAnswer3();
            fileData.readAnswer4();
            fileData.readAnswer5();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void filldetail() {
        /*First Phase
            scenarioManager.s1.detail = "Taxi Driver\nEx Racing Driver\nWithout Criminal History\nMarried";
            scenarioManager.s2.detail = "IT Developer\nHacker\nVery Smart\nArrested For Fake Sale Pages\nSingle";
            scenarioManager.s3.detail = "Pro Theif\nWith Lot Of Criminal History\nDivorced";
            scenarioManager.s4.detail = "Body Bulider\nBoxer\nWith Street Fight Crimes\nMarried";
            scenarioManager.s5.detail = "Key Maker\nSo Agile\nMarried";
         */
        fileData.readDetail();
    }
}