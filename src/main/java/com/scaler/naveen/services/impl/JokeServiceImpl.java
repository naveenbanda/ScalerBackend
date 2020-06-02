package com.scaler.naveen.services.impl;


import com.scaler.naveen.services.JokeService;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class JokeServiceImpl implements JokeService {

    public String getRandomJoke() {
        int size = jokes.length;
        Random r = new Random();
        int low = 0;
        int high = size-1;
        int random_number = r.nextInt(high-low) + low;
        return jokes[random_number];
    }

    private static String jokes[] = {
            "Q. What's O. J. Simpson's web address? A. Slash, slash, backslash, slash, slash, escape.",
            "Q: If a person who speaks three languages is called \"trilingual,\" and a person who speaks two languages is called \"bilingual,\" what do you call a person who only speaks one language? A: American!",
            "What do you get when you run over a parakeet with a lawnmower? Shredded tweet.",
            "Two kindergarten girls were talking outside: one said, \"You won't believe what I saw on the patio yesterday....a condom!\" The second girl asked, \"What's a patio?\"",
            "A little girl asked her father, \"Daddy? Do all fairy tales begin with 'Once Upon a Time'?\" He replied, \"No, there is a whole series of fairy tales that begin with 'If elected I promise'.\"",
            "Recently a teacher, a garbage collector, and a lawyer wound up together at the Pearly Gates. St. Peter informed them that in order to get into Heaven, they would each have to answer one question. St. Peter addressed the teacher and asked, \"What was the name of the ship that crashed into the iceberg? They just made a movie about it.\" The teacher answered quickly, \"That would be the Titanic.\" St. Peter let him through the gate. St. Peter turned to the garbage man and, figuring Heaven didn't really need all the odors that this guy would bring with him, decided to make the question a little harder: \"How many people died on the ship?\" Fortunately for him, the trash man had just seen the movie. \"1,228,\" he answered. \"That's right! You may enter.\" St. Peter turned to the lawyer: \"Name them.\"",
            "A preist, a 12-year-old kid, and the smartest guy in the world are on a plane. The pilot screams, \"The plane is going down! You have to jump!\" He then grabs a parachute and jumps off, leaving only two more parachutes on the plane. The smartest guy in the world says, \"I have to go. I mean, I'm the smartest guy in the world!\" He grabs a parachute, and jumps. The priest then looks at the 12-year-old kid, and says, \"Go, my son. You have a long life to live.\" The kid calmly responds: \"Dude, chill. We'll be fine. The 'smartest guy in the world' took my backpack.\"",
            "A man is driving in the country one evening when his car stalls and won't start. He goes up to a nearby farm house for help, and because it is suppertime he is asked to stay for supper. When he sits down at the table he notices that a pig is sitting at the table with them for supper and that the pig has a wooden leg. As they are eating and chatting, he eventually asks the farmer why the pig is there and why it has a wooden leg. \"Oh,\" says the farmer, \"that is a very special pig. Last month my wife and daughter were in the barn when it caught fire. The pig saw this, ran to the barn, tipped over a pail of water, crawled over the wet floor to reach them and pulled them out of the barn safely. A special pig like that, you just don't eat it all at once!\"",
            "Chuck Norris' calendar goes straight from March 31st to April 2nd; no one fools Chuck Norris.",
            "The new employee stood before the paper shredder looking confused. \"Need some help?\" a secretary, walking by, asked. \"Yes,\" he replied, \"how does this thing work?\" \"Simple,\" she said, taking the fat report from his hand and feeding it into the shredder. \"Thanks, but where do the copies come out?\"",
            "A guy had been feeling down for so long that he finally decided to seek the aid of a psychiatrist. He went there, lay on the couch, spilled his guts then waited for the profound wisdom of the psychiatrist to make him feel better. The psychiatrist asked me a few questions, took some notes then sat thinking in silence for a few minutes with a puzzled look on his face. He looked up with an expression of delight and said, \"I think your problem is low self-esteem. It is very common among losers.\"",
            "An old man goes to the doctor for his yearly physical, his wife tagging along. When the doctor enters the examination room, he tells the old man, \"I need a urine sample, a stool sample and a sperm sample.\" The old man, being hard of hearing, looks at his wife and yells: \"WHAT? What did he say? What's he want?\" His wife yells back, \"He needs your underwear.\"",
            "When most people claim to be \"killing time\", it's only an expression. When Chuck Norris kills time, the minutes actually cease to exist.",
            "A man joins a big corporate empire as a trainee. On his very first day of work, he dials the pantry and shouts into the phone: \"Get me a coffee, quickly!\" The voice from the other side responds, \"You fool, you've dialed the wrong extension! Do you know who you're talking to, dumbo?\" \"No,\" replied the trainee. \"It's the CEO of the company, you fool!\" The trainee shouts back, \"And do YOU know who YOU are talking to, you fool?!\" \"No.\" replied the CEO indignantly. \"Good!\" replied the trainee, and puts down the phone.",
            "A man in a hot air balloon realized he was lost. He reduced altitude and spotted a woman below. He descended a bit more and shouted, \"Excuse me, can you help me? I promised a friend I would meet him an hour ago, but I don't know where I am.\" The woman below replied, \"You are in a hot air balloon hovering approximately 30 feet above the ground. You are between 40 and 41 degrees north latitude and between 59 and 60 degrees west longitude.\" \"You must be an engineer,\" said the balloonist. \"I am,\" replied the woman. \"How did you know?\" \"Well,\" answered the balloonist, \"everything you told me is technically correct, but I have no idea what to make of your information, and the fact is, I am still lost. Frankly, you've not been much help so far.\" The woman below responded, \"You must be in management.\" \"I am,\" replied the balloonist, \"but how did you know?\" \"Well,\" said the woman, \"you don't know where you are or where you are going. You have risen to where you are due to a large quantity of hot air. You made a promise that you have no idea how to keep, and you expect people beneath you to solve your problems. The fact is, you are in exactly the same position you were in before we met, but now, somehow, it's my fault!\"",
            "One day, a professor was giving a big test to his students. He handed out the tests and went back to his desk to wait. Once the test was over, the students all handed the tests back in. The professor noticed that one of the students had attached a $100 bill to his test with a note saying: \"A dollar per point.\" The next class the professor handed the tests back out. This student got back his test...and $64 change!"

    };
}
