import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;

public class ChatBotGUI extends JFrame {
    private JTextArea chatArea;
    private JTextField inputField;
    private JButton sendButton;
    private HashMap<String, String> responses;
    

    public ChatBotGUI() {
        setTitle("ChatBot");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        chatArea = new JTextArea();
        chatArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(chatArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setPreferredSize(new Dimension(700, 450));

        inputField = new JTextField(20);
        inputField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = inputField.getText().toLowerCase(); // Convert input to lowercase
                chatArea.append("You: " + input + "\n");
                inputField.setText("");
                respondTo(input);
            }
        });

        sendButton = new JButton("Send");
        sendButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = inputField.getText().toLowerCase(); // Convert input to lowercase
                chatArea.append("You: " + input + "\n");
                inputField.setText("");
                respondTo(input);
            }
        });

        JPanel panel = new JPanel(new FlowLayout());
        panel.add(inputField);
        panel.add(sendButton);

        getContentPane().add(scrollPane, BorderLayout.CENTER);
        getContentPane().add(panel, BorderLayout.SOUTH);

        pack();
        setVisible(true);

        
        responses = new HashMap<>();
        responses.put("hello", "Hello there!\nI can help you in this fields \nfood \nmedicines\n e-commerce websites ");
        responses.put("hai", "Hai there!\nI can help you in this fields \nfood \nmedicines\n e-commerce websites ");
        responses.put("food", "want to cook or order?");
        responses.put("hii", "Hii there!\nI can help you in this fields \nfood \nmedicines\n e-commerce websites ");
        responses.put("hey", "Hey there!\n I can help you in this fields \nfood \nmedicines\n e-commerce websites");
        responses.put("hi", "Hi there!\nI can help you in this fields \nfood \nmedicines\n e-commerce websites");
        responses.put("how are you", "I'm doing well, thank you for asking.");
        responses.put("what is your name", "My name is ChatBot.");
        responses.put("what can you do", "I can help answer your questions.");
        responses.put("goodbye", "Goodbye! Have a nice day.");
        responses.put("bye", "Goodbye! Have a nice day.");
        responses.put("what do you eat", "Iam a bot i wont eat");
        responses.put("im hungry","want to cook or order?");
        responses.put("health issues", "you can access these below diseases information\ninfluenza or flu\nfever\nhypertension\nmigraine\nrashes\nsinus\nblood pressure or bp\nsugar\ndiabetes\nvomiting\nitching");
        responses.put("medicine", "you can access medicines for below diseases\ninfluenza or flu\nfever\nhypertension\nmigraine\nrashes\nsinus\nblood pressure or bp\nsugar\ndiabetes\nvomiting\nitching");
        responses.put("shopping websites","You can get links for these websites mentioned\nAmazon\nFlipkart\nMyntra\nSnapdeal\nAjio\nOlx\nShopsy\ncars24   ");
   
    }

    public void respondTo(String input) {
        String response = "";

        if (input.contains("cook food") || input.contains("food items")|| input.contains("cook") || input.contains("i want to cook food")|| input.contains("cook")|| input.contains("how can i cook")) {
            response = "yes,we can help u \n list of some food items \ntomato rice\negg fried rice\n cheese omelette\ngrilled cheese sandwich\nchicken\npaneer curry\nfish curry\nprawns\nchole bhature\nrajma chawal";
            
        } 
        else if(input.contains("i want to order the food") || input.contains("food ordering")|| input.contains("order") || input.contains("order food")|| input.contains("order food for me"))
        {
            response="You may order food from these app's \n\nzomato:https://www.zomato.com/ncr/golf-course-order-online \n\n Swiggy : https://www.swiggy.com/ \n \n Domino's : https://www.dominos.co.in/ \n \n Uber Eats :https://www.ubereats.com/ \n \n foodpanda : https://www.foodpanda.com/ \n \n Just Eat : https://www.justeattakeaway.com/";
        }
       
        else if(input.contains("tomato rice") || input.contains("tomato rice recipe")|| input.contains("how to prepare tomato rice"))
        {
            response="Ingredients:\n 1 cup long-grain rice \n2 tbsp oil 1 onion, chopped\n 2-3 cloves garlic, minced \n1-2 green chilies, chopped\n 2 medium-sized tomatoes, chopped \n1/2 tsp turmeric powder\n 1 tsp red chili powder \n1 tsp cumin powder Salt to taste \n2 cups water \nCoriander leaves for garnishing\n \n Instructions:\n Rinse the rice with water and soak it for 15-20 minutes.\n Heat oil in a pan over medium heat.\n Add chopped onions and saute until they turn translucent.\n Add minced garlic and chopped green chilies to the pan and saute for a minute.\n Add chopped tomatoes to the pan and cook until they become soft and mushy.\n Add turmeric powder, red chili powder, cumin powder, and salt to the pan and stir for a minute. \nDrain the water from the rice and add it to the pan. \nStir well so that the rice is coated with the tomato mixture.\n Add 2 cups of water to the pan and stir. \nCover the pan with a lid and let it cook on low heat for 15-20 minutes or until the rice is cooked and the water is absorbed.\n Once the rice is cooked, turn off the heat and let it rest for 5-10 minutes.\n Fluff the rice with a fork and garnish with coriander leaves.\n Your tomato rice is ready to serve! \n for more details visit this website \n \n https://www.vegrecipesofindia.com/tomato-rice-recipe-easy-tomato-rice/\n \n food chatbot :\nhttps://botbot.ai/solutions/food-beverage-chatbot/";
        }
        else if(input.contains("egg fried rice")|| input.contains("egg fried rice recipe")|| input.contains("how to prepare egg fried rice"))
        
        {
            response="Ingredients:\n 2 cups of cooked rice (preferably day-old rice)\n 2 eggs, lightly beaten \n 1/2 cup of frozen peas and carrots\n 1/2 cup of chopped onion\n 2 cloves of garlic, minced \n2 tablespoons of vegetable oil \n2 tablespoons of soy sauce \nSalt and pepper \n \n Instructions: \n Heat a wok or large frying pan over high heat. \nAdd the vegetable oil and swirl to coat the bottom of the pan.\n Add the chopped onion and garlic to the pan and stir-fry for about 1-2 minutes until the onion is translucent.\n Add the frozen peas and carrots to the pan and stir-fry for another 1-2 minutes until they are tender.\n Push the vegetables to one side of the pan and add the beaten eggs to the other side.\n Scramble the eggs until they are cooked through, then mix them in with the vegetables.\n Add the cooked rice to the pan and stir-fry everything together for 2-3 minutes until the rice is heated through and lightly toasted.\n Drizzle soy sauce over the rice and stir-fry for another minute until everything is evenly coated.\n Add salt and pepper to taste. \nGarnish with sliced green onions and sesame seeds if desired, and serve hot.\n That's it! Enjoy your delicious egg fried rice!\n for more details please visit this website \n \n https://www.indianhealthyrecipes.com/egg-fried-rice/ \n \n food chatbot :\nhttps://botbot.ai/solutions/food-beverage-chatbot/";
        }   
        else if(input.contains("cheese omelette")|| input.contains("cheese omelette recipe")|| input.contains("how to prepare cheese omelette"))
        {
            response="Ingredients : \n 1-2 pats of butter 4 eggs  \n 1 to 2 ounces (28 to 57 g) of cheddar cheese \n 1 thick slice of ham, optional \n  Salt and pepper \n step 1 :Crack the eggs into a bowl and beat them \n step 2:Grate 1 to 2 ounces (28 to 57 g) of cheddar cheese and chop the ham \n step 3 :Heat a couple of pats of butter in a medium frying pan \n step 4:Add the eggs to the pan and spread them out. \n step 5:Sprinkle the cheese in after the eggs are mostly cooked \n step 6 :Fold the omelette over \n and your cheese omelette is ready \nTo know more in detailed manner please visit this website \n  https://www.wikihow.com/Make-Homemade-Food \n \n food chatbot :\nhttps://botbot.ai/solutions/food-beverage-chatbot/"; 
        }
        else if(input.contains("grilled cheese sandwich")|| input.contains("cheese sandwich recipe")|| input.contains("how to prepare cheese sandwich"))
        {
            response="Ingredients: \n 2 slices of bread \n 2 slices of cheddar cheese \n 1 tablespoon of butter \n \n Preparation Steps: \n step 1:Preheat a non-stick pan over medium heat. /n step 2:Butter one side of each bread slice. \n step 3:Place one slice of cheese on the non-buttered side of one slice of bread, and top with the other slice of cheese and the other slice of bread, buttered side facing up. \n step 4:Place the sandwich in the pan and cook for 2-3 minutes, until the bread is golden brown. \n step 5:Flip the sandwich and cook for an additional 2-3 minutes, until the cheese is melted and the bread is golden brown. \n step 6:Remove the sandwich from the pan and let it cool for a minute or two before serving , your sandwich is ready \n  \n https://www.allrecipes.com/recipe/23891/grilled-cheese-sandwich/ \n \n food chatbot :\nhttps://botbot.ai/solutions/food-beverage-chatbot/";
        }
        else if(input.contains("chicken")|| input.contains("chicken recipe")|| input.contains("how to prepare chicken"))
        {
            response="Ingredients:\n 4 boneless, skinless chicken breasts, cut into bite-sized pieces \n2 tablespoons olive oil\n 1 onion, chopped \n3 garlic cloves, minced \n1 tablespoon ginger, grated \n1 tablespoon curry powder \n1 teaspoon ground cumin \n1 teaspoon ground coriander\n1/2 teaspoon turmeric\n 1/2 teaspoon paprika \n1/2 teaspoon cayenne pepper  1 cup chicken broth Salt \n 1/2 cup coconut milk Fresh \n \n Instructions: \nHeat the olive oil in a large saucepan over medium heat. \nAdd the onion, garlic, and ginger and sauté for 2-3 minutes or until the onion is translucent.\n Add the chicken and cook until browned on all sides.\n Add the curry powder, cumin, coriander, turmeric, paprika, and cayenne pepper (if using) and stir to combine. \nAdd the diced tomatoes and chicken broth and bring the mixture to a boil.\n Reduce the heat to low and simmer for 20-25 minutes or until the chicken is cooked through and tender.\n Add the coconut milk and stir to combine. \nSeason with salt and pepper to taste.\n Garnish with fresh cilantro and serve over rice or with naan bread. \n \n https://kandrafoods.com/info/chicken-pickle-recipe-preparation-steps/ \n \n food chatbot :\nhttps://botbot.ai/solutions/food-beverage-chatbot/";
            
        } else if(input.contains("paneer curry")|| input.contains("paneer curry recipe")|| input.contains("how to prepare paneer curry"))
        {
            response="Ingredients: \n200 grams paneer \n2 medium-sized onions, chopped \n2 medium-sized tomatoes, chopped \n1 green chili, chopped \n1 tablespoon ginger-garlic paste \n1 teaspoon cumin seeds \n1 teaspoon coriander powder \n1 teaspoon garam masala \n1/2 teaspoon turmeric powder \n1/2 teaspoon red chili powder Salt to taste \n2 tablespoons oil \n1/4 cup fresh coriander leaves, chopped \n \nInstructions: \nCut the paneer into cubes and set aside. \nHeat oil in a pan and add cumin seeds. \nLet them splutter. \nAdd chopped onions and green chili.\n Saute until the onions turn translucent.\n Add ginger-garlic paste and saute for a minute. \nAdd chopped tomatoes and all the spices - coriander powder, garam masala, turmeric powder, red chili powder, and salt. \nMix well and cook for 5-7 minutes until the tomatoes are soft and mushy. \nAdd paneer cubes and mix gently. \nAdd half a cup of water and simmer for 10-15 minutes until the curry thickens and the paneer absorbs the flavors. \nGarnish with chopped coriander leaves and serve hot with rice or naan. \nEnjoy your delicious paneer curry! \n \n https://www.funfoodfrolic.com/paneer-curry-recipe/\n \n food chatbot :\nhttps://botbot.ai/solutions/food-beverage-chatbot/";
        }
        else if(input.contains("fish curry")|| input.contains("fish curry recipe")|| input.contains("how to prepare egg fried curry"))
        {
            response="Ingredients:\n 1 pound of fish (tilapia, cod, or any firm white fish) \n2 tablespoons of vegetable oil \n1 onion, finely chopped \n2-3 garlic cloves, minced\n 1 tablespoon of ginger paste \n2-3 green chilies, finely chopped \n1 teaspoon of cumin powder \n1 teaspoon of coriander powder \n1/2 teaspoon of turmeric powder \n1/2 teaspoon of red chili powder \n1/2 teaspoon of garam masala powder \n1 tomato, chopped \n1 cup of coconut milk \n \n Instructions: \nClean the fish and cut it into medium-sized pieces. \nSprinkle salt and turmeric powder on the fish and set aside. \nHeat the oil in a large pot or pan over medium-high heat. \nAdd the chopped onion and sauté for 2-3 minutes or until translucent. \nAdd the minced garlic, ginger paste, and chopped green chilies to the pot and sauté for another minute. \nAdd the cumin powder, coriander powder, turmeric powder, red chili powder, and garam masala powder to the pot and stir well. \nAdd the chopped tomato to the pot and cook for 2-3 minutes or until it softens.\n Pour in the coconut milk and stir well. \nAdd salt to taste. \nAdd the fish pieces to the pot and gently stir to coat them with the curry sauce. \nCover the pot and let the fish cook for about 10-12 minutes, or until it is cooked through. \nGarnish with chopped cilantro and serve hot with rice or bread.\n Enjoy your delicious fish curry!\n \n https://www.indianhealthyrecipes.com/fish-curry-recipe/\n \n food chatbot :\nhttps://botbot.ai/solutions/food-beverage-chatbot/";
        }
        else if(input.contains("prawns")|| input.contains("prawns curry recipe")|| input.contains("how to prepare prawns curry"))
        {
            response="Ingredients:\n 500g prawns, cleaned and deveined \n1 onion, finely chopped \n2 tomatoes, finely chopped \n2 green chilies, finely chopped \n1 tablespoon ginger paste \n1 tablespoon garlic paste \n1 tablespoon coriander powder \n1 teaspoon cumin powder\n 1/2 teaspoon turmeric powder \n1/2 teaspoon red chili powder\n 1/2 teaspoon garam masala powder Salt to taste \n2 tablespoons oil \n1 cup water Fresh \ncoriander leaves for garnish\n \n Instructions: \nHeat oil in a pan over medium heat. \nAdd onions and fry until they turn translucent. \nAdd ginger and garlic paste and sauté for a minute. \nAdd chopped tomatoes, green chilies, and all the spice powders.\n Mix well and fry for 2-3 minutes until the tomatoes are softened. \nAdd cleaned and deveined prawns, salt to taste, and water.\n Stir well, cover the pan, and cook for 7-8 minutes until the prawns are cooked through. \nGarnish with fresh coriander leaves and serve hot with steamed rice or bread. \nEnjoy your delicious prawn curry! \n \n https://www.indianhealthyrecipes.com/prawn-curry-prawn-masala/\n \n food chatbot :\nhttps://botbot.ai/solutions/food-beverage-chatbot/";
        }
        else if(input.contains("chole bhature")|| input.contains("chole bhature recipe")|| input.contains("how to prepare chole bhature"))
        {
            response="Ingredients for chole bhature: \n1 cup dried chickpeas (kabuli chana), soaked overnight or for 8 hours\n 2-3 medium onions, finely chopped \n2 medium tomatoes, finely chopped\n 1 tablespoon ginger paste\n 1 tablespoon garlic paste \n2-3 green chilies, slit \n2 tablespoons oil\n 1 teaspoon cumin seeds \n1 teaspoon coriander powder\n 1 teaspoon cumin powder \n1/2 teaspoon turmeric powder \n2 cups all-purpose flour (maida) \n1/2 cup semolina (sooji) \n1/2 teaspoon baking powder \n1/2 teaspoon baking soda \n1/2 cup plain yogurt (dahi)\n \n To prepare chole bhature: \n drain the soaked chickpeas and pressure cook them with 3 cups of water and 1/2 teaspoon salt for 4-5 whistles or until they are tender. Keep aside. \nHeat oil in a pan over medium heat.\n Add cumin seeds and let them splutter. \nAdd chopped onions and fry until they turn golden brown.\n Add ginger and garlic paste, green chilies, and fry for a minute. \nAdd chopped tomatoes and all the spice powders. \nMix well and fry until the oil separates from the masala. \nAdd cooked chickpeas, salt to taste, and enough water to make a thick gravy. \nSimmer for 10-15 minutes until the gravy thickens and the chickpeas are coated well. \nGarnish with fresh coriander leaves and keep aside.\n To prepare bhature, mix together all-purpose flour, semolina, baking powder, baking soda, salt, and oil in a bowl.\n Rub the mixture with your fingers until it resembles breadcrumbs. \nAdd yogurt and mix well. \nKnead the dough with enough water to make a smooth, elastic dough. \nCover the dough with a damp cloth and let it rest for 2 hours. \nAfter 2 hours, divide the dough into equal-sized balls and roll each ball into a small disc or poori shape. \nHeat oil in a deep frying pan over medium-high heat.\n Once the oil is hot, gently slide the rolled bhature into the oil and fry until it puffs up and turns golden brown on both sides. \nRemove the bhature from the oil with a slotted spoon and place them on a paper towel to remove excess oil.\n Serve hot with chole, sliced onions, and green chilies. \nEnjoy your delicious chole bhature! \n \n https://www.vegrecipesofindia.com/chole-bhature/\n \n food chatbot :\nhttps://botbot.ai/solutions/food-beverage-chatbot/";
        }
        else if(input.contains("rajma chawal")|| input.contains("rajma chawal recipe")|| input.contains("how to prepare rajma chawal"))
        {
            response="Ingredients: \n1 cup Rajma (kidney beans) 2 cups water for soaking Rajma 3-4 cups water for cooking Rajma \n2 tbsp oil\n 1 onion, finely chopped \n1 tsp ginger paste\n 1 tsp garlic paste\n 2 tomatoes, pureed \n1 tsp cumin seeds \n1 tsp coriander powder \n1 tsp garam masala \n1 tsp red chili powder Salt, to taste\n 2 cups cooked rice\n \n Instructions: \nSoak the rajma in water for at least 6 hours or overnight. \nDrain the water and rinse the rajma. \nIn a pressure cooker, add 3-4 cups of water and the soaked rajma. \nPressure cook for about 15 minutes or until the rajma is tender. Keep aside.\n In a separate pan, heat oil and add cumin seeds. Let them splutter.\n Add finely chopped onions, ginger paste, and garlic paste.\n Cook until onions turn translucent.\n Add tomato puree and cook for a few minutes until the oil separates.\n Add coriander powder, garam masala, red chili powder, and salt. Mix well.\n Add the cooked rajma along with the water it was cooked in.\n Mix well and bring to a boil. \nLet the rajma simmer for about 10-15 minutes or until the gravy thickens and the rajma is well coated with the spices. \nServe hot with steamed rice. \nEnjoy your delicious Rajma Chawal! \n \n https://www.tarladalal.com/rajma-chawal-punjabi-rajma-chawal-4951r\n \n food chatbot :\nhttps://botbot.ai/solutions/food-beverage-chatbot/";
        }
        

        else if(input.contains("influenza") || input.contains("flu") || input.contains("if i get flu") || input.contains("what are the symptoms for flu") || input.contains("what can i do when i get flu")|| input.contains("i am suffering from flu") )
        {
            response="symptoms: \n fever \n cough \n  body aches \n  fatigue \n headache \n If you have any of these symptoms you may use these medicine : \n zanamivir (trade name Relenza®) \n baloxavir marboxil (trade name Xofluza®) \n\n Any query visit this link \n https://www.mayoclinic.org/diseases-conditions/flu/symptoms-causes/syc-20351719 \n \n for online doctor consultation :\n https://www.mfine.co/online-doctor-consultation/";
        }
        else if(input.contains("common cold") || input.contains("cold") || input.contains("running nose") || input.contains("if i get cold") || input.contains("what are the symptoms for cold") || input.contains("what can i do when i get cold"))
        {
            response="symptoms: \n sneezing \n cough \n  runny nose \n  sore throat \n mild fever \n If you have any of these symptoms you may use these medicine : \n  Acetaminophen (Tylenol®) \n phenylephrine (Sudafed PE®) \n Dextromethorphan (DXM) \n Acetaminophen (Children's/Infant's Tylenol®) \n \nAny query visit this link \n https://en.wikipedia.org/wiki/Common_cold \n \n for online doctor consultation :\n https://www.mfine.co/online-doctor-consultation/";
        }else if(input.contains("asthma") || input.contains("what if i get asthma") || input.contains("if i get asthma") || input.contains("what are the symptoms for asthma") || input.contains("what can i do when i get asthma"))
        {
            response="symptoms: \n wheezing \n cough \n   shortness of breath \n  chest tightness  \n If you have any of these symptoms you may use these medicine : \n  Duolin (Brand name) \n Prednisone Intensol® \n  Rayos® \n Medrol® \n Alvesco®(Brand name) \n Any query visit this link \n \n https://www.who.int/news-room/fact-sheets/detail/asthma#:~:text=Asthma%20is%20a%20major%20noncommunicable,of%20breath%20and%20chest%20tightness. \n \n for online doctor consultation :\n https://www.mfine.co/online-doctor-consultation/";
        }
        else if(input.contains("diabetes") || input.contains("what if i get diabetes") || input.contains("if i get diabetes") || input.contains("what are the symptoms for diabetes") || input.contains("what can i do when i get diabetes"))
        {
            response="symptoms: \n increased thirst \n  blurred vision \n   weight loss \n frequent urination \n  fatigue \n  slow healing wounds \n If you have any of these symptoms you may use these medicine : \n Insulin type:-Humulin R U-100 \n Novolin R FlexPen \n  inhaled insulin (Afrezza) \n insulin lispro-aabc (Lyumjev, Lyumjev KwikPen) \n Any query visit this link \n\n  https://www.cdc.gov/diabetes/basics/diabetes.html#:~:text=With%20Diabetes%2C%20your%20body%20either,releases%20it%20into%20your%20bloodstream. \n \n for online doctor consultation :\n https://www.mfine.co/online-doctor-consultation/";
        }
        else if(input.contains("hypertension") || input.contains("high blood pressure") || input.contains("what if i get high blood pressure") || input.contains("what if i get blood pressure") || input.contains("if i get blood pressure") || input.contains("what are the symptoms for blood pressure") || input.contains("what are the symptoms for hypertension") || input.contains("what can i do when i get blood pressure") || input.contains("what can i do when i get hypertension"))
        {
            response="symptoms: \n headaches \n  chest pain \n shortness of breath \n  fatigue \n  irregular heartbeat \n If you have any of these symptoms you may use these medicine : \n Amlodipine (Norvasc, Lotrel) \n Diltiazem (Cardizem CD, Cardizem SR, Dilacor XR, Tiazac) \n  Felodipine (Plendil) \n Nisoldipine (Sular) \n Any query visit this link \n https://www.mayoclinic.org/diseases-conditions/high-blood-pressure/symptoms-causes/syc-20373410 \n \n for online doctor consultation :\n https://www.mfine.co/online-doctor-consultation/";
        }
        else if(input.contains("migraine") || input.contains("headache") || input.contains("what if i get migraine") || input.contains("what if i get headache") || input.contains("if i get migraine") || input.contains("what are the symptoms for headache") || input.contains("what are the symptoms for migraine") || input.contains("what can i do when i get migraine") || input.contains("what can i do when i get headache"))
        {
            response="symptoms: \n severe headache \n  nausea \n vomiting \n  fatigue \n sensitivity to light and sound \n If you have any of these symptoms you may use these medicine : \n sumatriptan (Imitrex, Tosymra) for migraine \n rizatriptan (Maxalt, Maxalt-MLT) for migraine \n   Bayer for headache \n Bufferin for headache \n Any query visit this link \n https://www.mayoclinic.org/diseases-conditions/migraine-headache/symptoms-causes/syc-20360201#:~:text=A%20migraine%20is%20a%20headache,sensitivity%20to%20light%20and%20sound. \n https://www.mayoclinic.org/symptoms/headache/basics/definition/sym-20050800#:~:text=see%20a%20doctor-,Definition,sensation%20or%20a%20dull%20ache. \n \n for online doctor consultation :\n https://www.mfine.co/online-doctor-consultation/";
        }
        else if(input.contains("rashes") || input.contains("itching") || input.contains("what if i get itching") || input.contains("what if i get rashes") || input.contains("if i get rashes") || input.contains("what are the symptoms for rashes") || input.contains("what are the symptoms for rashes") || input.contains("what can i do when i get rashes") || input.contains("what can i do when i get itching"))
        {
            response="symptoms: \n dry skin \n  insect bites and hives \n scabies \n  Inflamed or swollen \n  Burning or stinging \n If you have any of these symptoms you may use these medicine : \n Hydrocortisone cream (1%) \n oatmeal bath products \n Oral antihistamines may help relieve itchy skin \n Stronger cortisone cream \n Any query visit this link \n https://my.clevelandclinic.org/health/diseases/17413-rashes-red-skin#:~:text=Skin%20rashes%20can%20be%20red,the%20source%20of%20skin%20rashes.\n https://medlineplus.gov/ency/article/003217.htm#:~:text=Itching%20is%20a%20tingling%20or,or%20only%20in%20one%20location. \n \n for online doctor consultation :\n https://www.mfine.co/online-doctor-consultation/";
        }
        else if(input.contains("sinus") || input.contains("chronic sinusitis") || input.contains("what if i get sinus") || input.contains("what if i get sinus") || input.contains("if i get sinus") || input.contains("what are the symptoms for sinus") || input.contains("what can i do when i get sinus"))
        {
            response="symptoms: \n Nasal inflammation \n  runny nose \n Ear pain \n  Headache \n  Aching in your upper jaw and teeth \n Cough or throat clearing \n Bad breath \n If you have any of these symptoms you may use these medicine : \n ibuprofen (Advil) \n acetaminophen (Tylenol)  \n  Oral Steroids \n prednisone \n Any query visit this link \n https://medlineplus.gov/ency/article/000647.htm#:~:text=Expand%20Section,to%20flow%20through%20the%20sinuses. \n \n for online doctor consultation :\n https://www.mfine.co/online-doctor-consultation/";
        }
        else if(input.contains("feaver") || input.contains("high feaver") || input.contains("what if i get feaver") || input.contains("what if i get high feaver ") || input.contains("if i get feaver") || input.contains("what are the symptoms for feaver") || input.contains("what can i do when i get feaver"))
        {
            response="symptoms: \n 100.4°F (38°C) measured in the bottom (rectally) \n  99.5°F (37.5°C) measured in the mouth (orally) \n 99°F (37.2°C) measured under the arm (axillary) \n  Sweating \n General weakness \n Muscle aches \n Loss of appetite \n If you have any of these symptoms you may use these medicine : \n ibuprofen (Advil) \n naproxen (Aleve)  \n  aspirin (regular strength) \n acetaminophen (Tylenol) \n Any query visit this link \n https://www.pennmedicine.org/for-patients-and-visitors/patient-information/conditions-treated-a-to-z/fever#:~:text=Fever%20is%20the%20temporary%20increase,measured%20under%20the%20arm%20(axillary) \n \n for online doctor consultation :\n https://www.mfine.co/online-doctor-consultation/";
        }
        else if(input.contains("dengue") || input.contains("what if i get dengue") || input.contains("if i get dengue") || input.contains("what are the symptoms for dengue") || input.contains("what can i do when i get dengue"))
        {
            response="symptoms: \n Nausea \n Vomiting (at least 3 times in 24 hours) \n Rash \n Aches and pains (eye pain, typically behind the eyes, muscle, joint, or bone pain) \n vomiting \n Belly pain, tenderness \n If you have any of these symptoms you may use these medicine : \n acetaminophen (Tylenol) \n  ibuprofen (Advil, Motrin IB) \n  naproxen sodium (Aleve) \n aspirin \n Any query visit this link \n https://www.mayoclinic.org/diseases-conditions/dengue-fever/diagnosis-treatment/drc-20353084 \n \n for online doctor consultation :\n https://www.mfine.co/online-doctor-consultation/";
        }
        else if(input.contains("cough") || input.contains("stuffy nose") || input.contains("coughing") || input.contains("if i get cough") || input.contains("what are the symptoms for cough") || input.contains("what can i do when i get cough"))
        {
            response="symptoms: \n A feeling of liquid running down the back of your throat (postnasal drip) \n Hoarseness \n  Heartburn or a sour taste in your mouth \n  Wheezing and shortness of breath \n If you have any of these symptoms you may use these medicine : \n  dextromethorphan  \n pholcodine \n guaifenesin \n  ipecacuanha  \n Any query visit this link \n https://patient.info/chest-lungs/cough-leaflet/cough-medicines#:~:text=If%20you%20have%20a%20dry,the%20most%20suitable%20to%20try. \n \n for online doctor consultation :\n https://www.mfine.co/online-doctor-consultation/";
        }
        else if(input.contains("feeling weak and tired") || input.contains("feeling weak and high temperature") || input.contains("feeling weak") || input.contains("weakness") || input.contains("felling ill") || input.contains("feeling tired") || input.contains("i am feeling weak")  )
        {
            response="symptoms: \n feaver \n cough \n  body aches \n  fatigue \n headache \n If you have any of these symptoms you may use these medicine : \n zanamivir (trade name Relenza) \n baloxavir marboxil (trade name Xofluza) \n Any query visit this link \n https://www.mayoclinic.org/diseases-conditions/flu/symptoms-causes/syc-20351719 \n \n for online doctor consultation :\n https://www.mfine.co/online-doctor-consultation/";
        }

        else if(input.contains("top 10 shopping websites") || input.contains("shopping websites") || input.contains("shopping websites in india") || input.contains("give me the link of shopping websites") || input.contains("i want to order something") || input.contains("i want to shop") || input.contains("websites to shop")   )
        {
            response=" Amazon India - https://www.amazon.in/ \n\n Flipkart https://www.flipkart.com/ \n \nMyntra - https://www.myntra.com/ \n\n Snapdeal - https://www.snapdeal.com/ \n \nAjio - https://www.ajio.com/ \n\n Tata Cliq - https://www.tatacliq.com/ \n\n Bigbasket - https://www.bigbasket.com/ \n \nNykaa - https://www.nykaa.com/ \n \n Shopsy - https://www.shopsy.com/ \n \nShopClues - https://www.shopclues.com/";
        }
        else if(input.contains("amazon") || input.contains("i need  to open amazon") || input.contains("open amazon") || input.contains("give me the amazon link") || input.contains("i want to order in amazon") || input.contains("amazon.com") || input.contains("amazon.in"))
        {
            response=" https://www.amazon.com/ \n \n amazon chatbot :\n https://aws.amazon.com/chatbot/";
        }
        else if(input.contains("flipkart") || input.contains("i need  to open flipkart") || input.contains("open flipkart") || input.contains("give me the flipkart link") || input.contains("i want to order in flipkart") || input.contains("flipkart.com") || input.contains("flipkart.in")   )
        {
            response=" https://www.flipkart.com/ \n \n flipkart chatbot :\n https://yellow.ai/";
        }
        else if(input.contains("myntra") || input.contains("i need  to open myntra") || input.contains("open myntra") || input.contains("give me the myntra link") || input.contains("i want to order in myntra") || input.contains("myntra.com") || input.contains("myntra.in")   )
        {
            response=" https://www.myntra.com/ \n \n myntra chatbot :\n https://www.myntra.com/i-bot";
        }
        else if(input.contains("snapdeal") || input.contains("i need  to open snapdeal") || input.contains("open snapdeal") || input.contains("give me the snapdeal link") || input.contains("i want to order in snapdeal") || input.contains("snapdeal.com") || input.contains("snapdeal.in")   )
        {
            response=" https://www.snapdeal.com/ \n \n snapdeal chatbot :\n https://api.whatsapp.com/send/?phone=918130222868&text=Hi+Snapdeal%2C+I+need+your+support+for+one+of+my+suborder.&type=phone_number&app_absent=0&utm_campaign=needHelpOnWhatsappChat_track&utm_source=contactUsCampaig/";
        }
        else if(input.contains("ajio") || input.contains("i need  to open ajio") || input.contains("open ajio") || input.contains("give me the ajio link") || input.contains("i want to order in ajio") || input.contains("ajio.com") || input.contains("ajio.in")   )
        {
            response=" https://www.ajio.com/ \n \n ajio chatbot :\n https://www.ajio.com/selfcare";
        }
        else if(input.contains("shopsy") || input.contains("i need  to open shopsy") || input.contains("open shopsy") || input.contains("give me the shopsy link") || input.contains("i want to order in shopsy") || input.contains("shopsy.com") || input.contains("shopsy.in")   )
        {
            response=" https://www.shopsy.com/ \n \n shopsy chatbot :\n https://aws.shopsy.com/chatbot/";
        }
        else if(input.contains("cars24") || input.contains("i want to sell my old car") || input.contains("i want to sell my car") || input.contains("sell my old car") || input.contains("i need to sell my car ") || input.contains("old cars selling website") || input.contains("car selling website")   )
        {
            response="You need to visit:\n \nhttps://www.cars24.com/ \n https://www.olxautos.com/";
        }
        else if(input.contains("olx") || input.contains("i want to sell my old things") || input.contains("i want to sell my things") || input.contains("i need to order on olx") || input.contains("i need to sell my mobile") || input.contains("i need to sell my bike") || input.contains("i need to sell my phone") || input.contains("i need to sell my tvs ") || input.contains("i need to sell my tv") || input.contains("i need to sell electronic gadgets") || input.contains("old gadgets selling website") || input.contains("gadgets selling website")   )
        {
            response="You need to visit:\n \n  https://www.olx.com/";
        }



        else if(input.contains("i want to order in zomato") ||input.contains("zomato")||input.contains("order in zomato"))
        {
            response="here is the website link wher you can order the food in zomato \n \n  https://www.zomato.com/ncr/golf-course-order-online \n \n if you dont know how to order follow this link \n https://www.youtube.com/watch?v=7yQe-PYQ0CY&ab_channel=TECHTOWARD \n \n zomato chatbot :\n https://gethuman.com/chat/Zomato-com/report-new/Other ";

        }
        else if(input.contains("i want to order in swiggy") || input.contains("swiggy")||input.contains("order in swiggy"))
        {
            response="here is the website link wher you can order the food in swiggy \n \n  https://www.swiggy.com/ \n\n if you dont know how to order follow this link \n https://www.youtube.com/watch?v=0w4rgqcckdE&ab_channel=PKCHELP  \n \n swiggy chatbot :\n https://bytes.swiggy.com/chatbots-at-swiggy-6299116f9e69 ";
        }
        else if(input.contains("restaurants in hyderabad") || input.contains("best restaurants in hyderabad")|| input.contains("restaurants near by hyderabad") )
        {
            response="Paradise Biriyani, Hyderabad\nLocation: Jubilee Hills, Gachibowli, Inorbit Mall, Secunderabad \n Timings: 11:30 am to 11:00 pm (may vary across outlets) \nCost for Two:  800\n Must try: Biryani, Irani Chai, Osmania Biscuits, Cookies, Pastries, Lassi-Falooda\n location maps:https://www.google.com/maps/search/Paradise+Biryani,+Hyderabad+location/@17.3760553,78.3378524,11z?hl=en \n\nTatva, Jubilee Hills \n Location: Jubilee Hills Road, Jubilee Hills, Hyderabad \nTimings: 12:00 pm to 3:30 pm and 7:00 pm to 11:30 pm \nCost for Two:  1600 \nMust try: Borscht, Kamalkakdi Ke Galouti, Three Way Bruschetta, Nawabi Paneer\n \n Smoky Pitara, Jubilee Hills \n Location: Road 36, Jubilee Hills, Hyderabad \nTimings: 12:00 pm to 4:00 pm and 7:00 pm to 12:00 am\n Cost for Two:  1000 \nMust try: Manchow Soup, Aloo 65, Miloni Tarkari, Paneer Chatpat \n \n AB's Absolute Barbecues \n Location: Jubilee Hills, Gachibowli, Inorbit Mall, Secunderabad, Miyapur and Banjara Hills\n Timings: 12:00 pm to 4:30 pm and 6:30 pm to 11:30 pm \nCost for Two:  1500\n Must try: Methi Mahi Fish, Veg Kolhapuri, Andhra Fish Curry \n \n Mandil, Kondapur \n Location: Ravi Colony, Kondapur, Hyderabad \nTimings: 12:00 pm to 3:30 pm and 7:00 pm to 11:00 pm\n Cost for Two:  800 \nMust try: Aaf-tab Murgh, Lal Maans, Sondhe Aloo, Papdi Paneer, Qubani Ka Meetha, Nizami Hundi";
        }
        else if(input.contains("restaurants in vijayawada") || input.contains("best restaurants in vijayawada")|| input.contains("restaurants near by vijayawada") || input.contains("hotels in vijayawada") || input.contains("hotel in vijayawada") )
        {
            response="Best Vegetarian Restaurants in Vijayawada  \n \n Sri Ramayya Mess and Caterers, Vijayawada \n Location: Prakasam Road, Governorpet, Vijayawada \n Open Timings: 11:30 AM to 4:00 PM \n Meal for two:  100-200 \n What not to miss: Gongura Pachadi, Ulava Charu, Bread Halwa, and Badam Kheer \n\n  Babai Hotel, Vijayawada \n Location: NRP Road, Gandhi Nagar, Vijayawada \n Open Timings: 7:00 AM to 1:00 PM \n Meal for two:  300 \n What not to miss: Babai Idli, Upma Pesariattu, and Upma Dosa \n \n Best Non-vegetarian Restaurants in Vijayawada \n\n GAD Restaurant, Vijayawada \n Location: Taj Gateway, MG Road, Vijayawada \n Open Timings: 24X7 \n Meal for two:  2000 \n What not to miss: Tangri Biryani, Double Chocolate Bomb, Samosa Ragada, South Indian Coffee and Masala Tea\n \n Sweet Magic, Vijayawada \n Location: Multiple, Vijayawada \n Open Timings: 7:30 AM to 10:30 PM \n Meal for two:  800 \n What not to miss: Ulavacharu Chicken Biryani, Naatu Kudi Koora, Badaam Sweet, and Carrot Cake\n \n TFL, Vijayawada \n Location: Shanthi Nagar, 1st Lane, Moghalraj Puram, Labbipet, Vijayawada \n Open Timings: 10 AM to 10PM \n Meal for two:  400 \n What not to miss: Red Velvet Cake, Mashed Potatoes, English Breakfast";
        }
        else if(input.contains("restaurants in amritsar") || input.contains("best restaurants in amritsar")|| input.contains("restaurants near by amritsar") || input.contains("hotels in amritsar") || input.contains("hotel in amritsar") )
        {
            response="Veg Restaurants in Amritsar: \n\n Bharawan Da Dhaba, Amritsar\n Location: Town Hall, Amritsar \n Timings: 7:00 AM - 12:00 AM \n Meal for two:  500 \n \nKanha Sweets, Amritsar \n Location: Lawrence Road, Dayanand Nagar, Amritsar \n  Timings: 8:00 AM - 10:00 PM \n Meal for two:  150 \n \n The Kulcha Land, Amritsar \n Location: Ranjit Avenue, Amritsar \n Timings: 9:00 AM - 5:30 PM \n Meal for two:  200 \n \n Non-Veg Restaurants in Amritsar:\n \n Makhan Fish & Chicken Corner, Amritsar \n Location: Basant Nagar, Amritsar \n Timings: 11:00 AM - 11:30 PM\n  Meal for two:  700 \n \n Beera Chicken Corner, Amritsar \n Location: Majitha Road, Amritsar \n Timings: 12:30 PM - 11:00 PM \n Meal for two:  500 \n \n Crystal Restaurant, Amritsar \n Location: INA Colony, Amritsar \n Timing: 11:30 AM - 11:30 AM \n Meal for two:  800";
        }
        else if(input.contains("restaurants in punjab") || input.contains("best restaurants in punjab")|| input.contains("restaurants near by punjab") || input.contains("hotels in punjab") || input.contains("hotel in punjab") )
        {
            response="Haveli Restaurant in Jalandhar\n Location: Grand Trunk Road Khajurla, Jalandhar, Punjab 14400\n Timings: 9:00 AM - 11:00 PM \n Meal for two:  500 \n \nPunjab Grill in Chandigarh\n Location: SCO 122-3 Sector 17-C Chandigarh, Punjab Phone no: +91 172 4029444\n  Timings: 8:00 AM - 10:00 PM \n Meal for two:  150 \n \n Brothers Dhaba in Amritsar \n Location: Town Hall Chowk Amritsar, Punjab \n Timings: 9:00 AM - 9:30 PM \n Meal for two:  200 \n \n Kesar Da Dhaba in Amritsar \n Location: Chowk Passian Amritsar, Punjab \n Timings: 10:00 AM - 11:30 PM\n  Meal for two:  700 \n \n Love Italy in Jalandhar \n Location:Hotel Reagent Park G.T. Road, Jalandhar, Punjab \n Timings: 10:30 AM - 11:00 PM \n Meal for two:  500 ";
        }
        else if(input.contains("restaurants in jalandhar") || input.contains("best restaurants in jalandhar")|| input.contains("restaurants near by jalandhar") || input.contains("hotels in jalandhar") || input.contains("hotel in jalandhar") )
        {
            response="The Brewmaster Jalandhar\n Location: Chunmun Mall, 323, 3rd & 4th Floor, Opposite City Hospital, New Jawahar Nagar, Jalandhar \n Timings: 9:00 AM - 11:00 PM \n Meal for two:  900 \n \nSunny Side Up \n Location in Chandigarh\n Timings: 8:00 AM - 10:00 PM \n Meal for two:  1500 \n \n Heat 7 \n Location:  569-570, New Jawahar Nagar,Jalandhar \n Timings: 9:00 AM - 9:30 PM \n Meal for two:  2000 \n \n Fifth Avenue \n Location: Address: Above Pizza Hut, G.T. Road,Jalandhar, Punjab \n Timings: 10:00 AM - 11:30 PM\n  Meal for two:  700 \n \n Eat Well Housey in Jalandhar \n Location:Main Post Office, GT road,Near Namdev Chowk, Jalandhar, Punjab \n Timings: 10:30 AM - 11:00 PM \n Meal for two:  1500 ";
        }
        else if(input.contains("restaurants in phagwara") || input.contains("best restaurants in phagwara")|| input.contains("restaurants near by phagwara") || input.contains("hotels in phagwara") || input.contains("hotel in phagwara") )
        {
            response="Muncheez The Food Place\n Location:  Babbar akali market, central Town ,Phagwara, India - 144401 \n Timings: 7:00 AM - 12:00 AM \n Meal for two:  900 \n \n Food Lounge 39 Phagwara\n Location: Opp. Bus Stand , Handa City Centre , G.T. Road, Phagwara., Phagwara, India - 144401 \n  Timings: 8:00 AM - 10:00 PM \n Meal for two:  1500 \n \n Janjua Restaurant And Pub Bar \n Location:  GT Road, Phagwara, Phagwara, India - 144401 \n Timings: 9:00 AM - 5:30 PM \n Meal for two:  200 \n \n Khana Khazana - Ajit Foods \n Location: entral Town ,Phagwara, India - 144401\n Timings: 11:00 AM - 11:30 PM\n  Meal for two:  700 ";
        }


        
        








       
       
         else if (responses.containsKey(input)) {
            response = responses.get(input);
        } 
        else {
            response = "I'm sorry, I didn't understand your question. Can you please rephrase?";
        }

        chatArea.append("Bot: " + response + "\n");
    }

    public static void main(String[] args) {
        new ChatBotGUI();
    }
}
