package com.naskogeorgiev.homework10092016.models;

/**
 * Created by nasko.georgiev on 14.9.2016 г..
 */

public final class Country {

    private static String description;

    private Country() {

    }

    public static String spain() {
        description = "Spain, officially the Kingdom of Spain, is a sovereign state largely located on the Iberian Peninsula in southwestern Europe, with archipelagos in the Atlantic Ocean and Mediterranean Sea, and several small territories on and near the North African coast. Its Mainland is bordered to the south and east by the Mediterranean Sea except for a small land boundary with Gibraltar; to the north and northeast by France, Andorra, and the Bay of Biscay; and to the west and northwest by Portugal and the Atlantic Ocean. Along with France and Morocco, it is one of only three countries to have both Atlantic and Mediterranean coastlines. Extending to 1,214 km (754 mi), the Portugal–Spain border is the longest uninterrupted border within the European Union.";
        return description;
    }

    public static String france() {
        description = "France, officially the French Republic, is a sovereign transcontinental state comprising territory in western Europe and several overseas regions and territories.[XVI] The European, or metropolitan, area of France extends from the Mediterranean Sea to the English Channel and the North Sea, and from the Rhine to the Atlantic Ocean. Overseas France include French Guiana on the South American continent and several island territories in the Atlantic, Pacific and Indian oceans. France spans 643,801 square kilometres (248,573 sq mi) and has a total population of 66.7 million. It is a unitary semi-presidential republic with the capital in Paris, the country's largest city and main cultural and commercial centre.";
        return description;
    }

    public static String italy() {
        description = "Italy, officially the Italian Republic, is a unitary parliamentary republic in Europe.[note 1] Located in the heart of the Mediterranean Sea, Italy shares open land borders with France, Switzerland, Austria, Slovenia, San Marino and Vatican City. Italy covers an area of 301,338 km2 (116,347 sq mi) and has a largely temperate seasonal climate or Mediterranean climate; due to its shape, it is often referred to in Italy as lo Stivale (the Boot). With 61 million inhabitants, it is the third most populous EU member state.";
        return description;
    }

    public static String canada() {
        description = "Canada is a country in the northern half of North America. Its ten provinces and three territories extend from the Atlantic to the Pacific and northward into the Arctic Ocean, covering 9.98 million square kilometres (3.85 million square miles), making it the world's second-largest country by total area and the fourth-largest country by land area. Canada's border with the United States is the world's longest land border. Canada is sparsely populated, the majority of its land territory being dominated by forest and tundra and the Rocky Mountains; about four-fifths of the country's population of 35 million people live near the southern border, and the population is about four-fifths urbanized. The majority of Canada has a cold or severely cold winter climate, but southerly areas are warm in summer.";
        return description;
    }

    public static String mexico() {
        description = "Mexico, officially the United Mexican States, is a federal republic in the southern half of North America. The country is bordered to the north by the United States; to the south and west by the Pacific Ocean; to the southeast by Guatemala, Belize, and the Caribbean Sea; and to the east by the Gulf of Mexico. Covering almost two million square kilometers (over 760,000 sq mi).";
        return description;
    }
}
