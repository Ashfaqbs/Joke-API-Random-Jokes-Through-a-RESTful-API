package com.restApi.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class JokeService {
	private static List<String> jokes = new ArrayList<>();


	static {

		jokes.add(" Do you want to hear a construction joke?\r\n"
				+ "\r\n"
				+ "Sorry, I’m still working on it.");
		jokes.add("Why should you never trust stairs?\r\n"
				+ "\r\n"
				+ "They’re always up to something.");	jokes.add("Why did the bullet end up losing his job?\r\n"
						+ "\r\n"
						+ "He got fired.");	jokes.add("Why aren’t koalas considered bears?\r\n"
								+ "\r\n"
								+ "They don’t have the right koala-fications.");	
						jokes.add("You: What cartoon mouse walks on two feet?\r\n"
								+ "\r\n"
								+ "Them: Mickey Mouse\r\n"
								+ "\r\n"
								+ "You: What duck walks on two feet?\r\n"
								+ "\r\n"
								+ "Them: Donald Duck\r\n"
								+ "\r\n"
								+ "You: No, all ducks do!");jokes.add("What’s a pirate’s favorite letter?\r\n"
										+ "\r\n"
										+ "You probably think it’s “R” but it be the “C”.");jokes.add("How much teddy bears never want to eat anything?\r\n"
												+ "\r\n"
												+ "Because they’re always stuffed.");jokes.add("Did you hear about the cheese factory that exploded in France?\r\n"
														+ "\r\n"
														+ "There was nothing left but de Brie.");
												jokes.add("Where should you go in the room if you’re feeling cold?\r\n"
														+ "\r\n"
														+ "The corner—they’re usually 90 degrees.");jokes.add("I can never take my dog to the park because the ducks keep trying to bite him.\r\n"
																+ "\r\n"
																+ "I guess that’s what I get for buying a pure bread dog.");jokes.add("What’s the difference between a poorly dressed man on a unicycle and a well-dressed man on a bicycle?\r\n"
																		+ "\r\n"
																		+ "Attire.");jokes.add(" What did the Buddhist ask the hot dog vendor?\r\n"
																				+ "\r\n"
																				+ "“Make me one with everything.”");jokes.add("You know why you never see elephants hiding up in trees?\r\n"
																						+ "\r\n"
																						+ "Because they’re really good at it.");
																				jokes.add(" A horse walks into a bar.\r\n"
																						+ "\r\n"
																						+ "The bartender says, “Why the long face?”");jokes.add("Can a kangaroo jump higher than the Empire State Building?\r\n"
																								+ "\r\n"
																								+ "Of course! The Empire State Building can’t jump.");jokes.add("A horse walks into a bar.\r\n"
																										+ "\r\n"
																										+ "The bartender says, “Hey!”\r\n"
																										+ "\r\n"
																										+ "The horse replies, “Sure.”");jokes.add("I googled “Rorshach test.”\r\n"
																												+ "\r\n"
																												+ "But for some reason, all that came up were pictures of my parents fighting.");jokes.add("What do we want?\r\n"
																														+ "\r\n"
																														+ "Low-flying airplane noises!"+"When do we want them?\r\n"
																														+ "\r\n"
																														+ "Nnnnneeeeeeeeeeoooooooooow!");
																												jokes.add(" I tried to win a suntanning competition.\r\n"
																														+ "\r\n"
																														+ "But all I got was bronze.");jokes.add("Why don’t seagulls fly over the bay?\r\n"
																																+ "\r\n"
																																+ "Because then they’d be bagels.");jokes.add("Did you hear about the painter who was hospitalized?\r\n"
																																		+ "\r\n"
																																		+ "The doctors say it was due to too many strokes.");jokes.add("Why are crabs so bad at sharing?\r\n"
																																				+ "\r\n"
																																				+ "Because they’re all shellfish.");jokes.add("What did the tie say to the hat?\r\n"
																																						+ "\r\n"
																																						+ "You go on ahead. I’ll hang around.");
		
		jokes.add("Why don't scientists trust atoms? Because they make up everything.");
        jokes.add("I told my wife she was drawing her eyebrows too high. She looked surprised.");
        jokes.add("Why did the tomato turn red? Because it saw the salad dressing!");
        jokes.add("Why did the hipster burn his tongue? He drank his coffee before it was cool.");
        jokes.add("Why was the math book sad? Because it had too many problems.");
        jokes.add("Why did the scarecrow win an award? Because he was outstanding in his field.");
        jokes.add("What do you get when you cross a snowman and a vampire? Frostbite.");
        jokes.add("Why don't skeletons fight each other? They don't have the guts.");
        jokes.add("Why did the chicken go to the seance? To talk to the other side.");
        jokes.add("Why did the banana go to the doctor? It wasn't peeling well.");
        jokes.add("Why did the coffee file a police report? It got mugged.");
        jokes.add("Why did the bicycle fall over? Because it was two-tired.");
        jokes.add("What do you call an alligator in a vest? An investigator.");
        jokes.add("Why did the frog call his insurance company? He had a jump in his car.");
        jokes.add("Why did the tomato turn red? Because it saw the salad dressing!");
        jokes.add("Why don’t scientists trust atoms? Because they make up everything.");
        jokes.add("I don’t trust people that do acupuncture. They’re back stabbers.");
        jokes.add("I’m reading a book on anti-gravity. It’s impossible to put down.");
        jokes.add("I told my wife she was drawing her eyebrows too high. She looked surprised.");
        jokes.add("Why was the math book sad? Because it had too many problems.");
        jokes.add("Why don’t seagulls fly by the bay? They would be bay-gulls!");
        jokes.add("I’m trying to organize a hide and seek competition, but it’s really hard to find good players…");
        jokes.add("Why did the chicken go to the séance? To talk to the other side.");
        jokes.add("I’m reading a book on the history of glue. I just can’t seem to put it down.");
        jokes.add("Why did the old man fall in the well? Because he couldn't see that well.");
        jokes.add("Why did the cookie go to the doctor? Because he was feeling crummy.");
        jokes.add("Why did the toilet paper roll down the hill? To get to the bottom.");
        jokes.add("Why did the hipster burn his tongue? He drank his coffee before it was cool.");
        jokes.add("What did the janitor say when he jumped out of the closet? Supplies!");
        jokes.add("I’m trying to start a band called ‘1023 Megabytes’… we haven’t got a gig yet.");
        jokes.add("Why don’t they play poker in the jungle? Too many cheetahs.");
        jokes.add("Why did the tomato turn red? Because it saw the salad dressing!");
        jokes.add("I used to play piano by ear, but now I use my hands.");
        jokes.add("I’m so good at sleeping, I can do it with my eyes closed.");
        jokes.add("I just found out I’m colorblind. The diagnosis came completely out of the purple.");
		
		
		
		
 jokes.add("I told my wife she was drawing her eyebrows too high. She looked surprised.");
        jokes.add("I'm reading a book on the history of glue. I just can't seem to put it down.");
        jokes.add("I don't trust people who do acupuncture. They're back stabbers.");
        jokes.add("Why don't skeletons fight each other? They don't have the guts.");
        jokes.add("I don't play soccer because I enjoy the sport. I'm just doing it for kicks.");
        jokes.add("I'm on a whiskey diet. I've lost three days already.");
        jokes.add("I'm not arguing. I'm just explaining why I'm right.");
        jokes.add("Why did the scarecrow win an award? Because he was outstanding in his field.");
        jokes.add("I'm a big fan of whiteboards. They're re-markable.");
        jokes.add("I used to have a job crushing cans. It was soda pressing.");
        jokes.add("I'm reading a book about anti-gravity. It's impossible to put down.");
        jokes.add("I don't really trust people who don't like dogs, but I trust dogs when they don't like people.");
        jokes.add("I was wondering why the ball was getting bigger. Then it hit me.");
        jokes.add("I told my wife she should embrace her mistakes. She gave me a hug.");
        jokes.add("Why did the tomato turn red? Because it saw the salad dressing.");
        jokes.add("I'm reading a horror story in braille. Something bad is about to happen. I can feel it.");
        jokes.add("I'm trying to organize a hide and seek tournament, but good players are hard to find.");
        jokes.add("I'm writing a book on the history of glue. I can't seem to stick to it.");
        jokes.add("Why did the coffee file a police report? It got mugged.");
        jokes.add("I told my wife she was drawing her eyebrows too high. She looked surprised.");
        jokes.add("Why don't oysters give to charity? Because they're shellfish.");
        jokes.add("I don't have a photographic memory. But I do have a photographic forgettery.");
        jokes.add("I was going to tell a time-traveling joke, but you guys didn't like it.");
        jokes.add("I'm reading a book on the history of glue. I just can't seem to put it down.");
        jokes.add("Why don't ants get sick? Because they have little ant-bodies.");
        jokes.add("I'm trying to start a hot air balloon business, but it really never takes off.");
        jokes.add("I'm a big fan of whiteboards. They're re-markable.");
        jokes.add("I told my wife she was drawing her eyebrows too high. She looked surprised.");
        jokes.add("What do you get when you cross a snowman and a vampire? Frostbite.");
        jokes.add("I couldn't figure out why the baseball kept getting bigger. Then it hit me.");
        jokes.add("I have a photographic memory, but I always forget to bring my camera.");
        jokes.add("Why did the chicken cross the playground? To get to the other slide.");
        jokes.add("Why did the golfer wear two pairs of pants? In case he got a hole in one.");		
		
		

	}



	public String getJokes()
	{

		Random random= new Random();
		int index = random.nextInt(jokes.size());	

		return jokes.get(index);
	}




}
