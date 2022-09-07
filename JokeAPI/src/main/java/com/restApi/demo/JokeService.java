package com.restApi.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class JokeService {
	private static List<String> list = new ArrayList<>();


	static {

		list.add(" Do you want to hear a construction joke?\r\n"
				+ "\r\n"
				+ "Sorry, I’m still working on it.");
		list.add("Why should you never trust stairs?\r\n"
				+ "\r\n"
				+ "They’re always up to something.");	list.add("Why did the bullet end up losing his job?\r\n"
						+ "\r\n"
						+ "He got fired.");	list.add("Why aren’t koalas considered bears?\r\n"
								+ "\r\n"
								+ "They don’t have the right koala-fications.");	
						list.add("You: What cartoon mouse walks on two feet?\r\n"
								+ "\r\n"
								+ "Them: Mickey Mouse\r\n"
								+ "\r\n"
								+ "You: What duck walks on two feet?\r\n"
								+ "\r\n"
								+ "Them: Donald Duck\r\n"
								+ "\r\n"
								+ "You: No, all ducks do!");list.add("What’s a pirate’s favorite letter?\r\n"
										+ "\r\n"
										+ "You probably think it’s “R” but it be the “C”.");list.add("How much teddy bears never want to eat anything?\r\n"
												+ "\r\n"
												+ "Because they’re always stuffed.");list.add("Did you hear about the cheese factory that exploded in France?\r\n"
														+ "\r\n"
														+ "There was nothing left but de Brie.");
												list.add("Where should you go in the room if you’re feeling cold?\r\n"
														+ "\r\n"
														+ "The corner—they’re usually 90 degrees.");list.add("I can never take my dog to the park because the ducks keep trying to bite him.\r\n"
																+ "\r\n"
																+ "I guess that’s what I get for buying a pure bread dog.");list.add("What’s the difference between a poorly dressed man on a unicycle and a well-dressed man on a bicycle?\r\n"
																		+ "\r\n"
																		+ "Attire.");list.add(" What did the Buddhist ask the hot dog vendor?\r\n"
																				+ "\r\n"
																				+ "“Make me one with everything.”");list.add("You know why you never see elephants hiding up in trees?\r\n"
																						+ "\r\n"
																						+ "Because they’re really good at it.");
																				list.add(" A horse walks into a bar.\r\n"
																						+ "\r\n"
																						+ "The bartender says, “Why the long face?”");list.add("Can a kangaroo jump higher than the Empire State Building?\r\n"
																								+ "\r\n"
																								+ "Of course! The Empire State Building can’t jump.");list.add("A horse walks into a bar.\r\n"
																										+ "\r\n"
																										+ "The bartender says, “Hey!”\r\n"
																										+ "\r\n"
																										+ "The horse replies, “Sure.”");list.add("I googled “Rorshach test.”\r\n"
																												+ "\r\n"
																												+ "But for some reason, all that came up were pictures of my parents fighting.");list.add("What do we want?\r\n"
																														+ "\r\n"
																														+ "Low-flying airplane noises!"+"When do we want them?\r\n"
																														+ "\r\n"
																														+ "Nnnnneeeeeeeeeeoooooooooow!");
																												list.add(" I tried to win a suntanning competition.\r\n"
																														+ "\r\n"
																														+ "But all I got was bronze.");list.add("Why don’t seagulls fly over the bay?\r\n"
																																+ "\r\n"
																																+ "Because then they’d be bagels.");list.add("Did you hear about the painter who was hospitalized?\r\n"
																																		+ "\r\n"
																																		+ "The doctors say it was due to too many strokes.");list.add("Why are crabs so bad at sharing?\r\n"
																																				+ "\r\n"
																																				+ "Because they’re all shellfish.");list.add("What did the tie say to the hat?\r\n"
																																						+ "\r\n"
																																						+ "You go on ahead. I’ll hang around.");

	}



	public String getJokes()
	{

		Random random= new Random();
		int index = random.nextInt(list.size());	

		return list.get(index);
	}




}
