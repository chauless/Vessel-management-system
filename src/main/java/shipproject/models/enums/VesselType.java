package shipproject.models.enums;

import lombok.Getter;

import java.io.Serializable;

@Getter
public enum VesselType implements Serializable {

    SALVAGE_AND_RESCUE("Salvage and rescue", "Render assistance to disabled ships, provide towing, salvage, diving," +
            "\n firefighting and heavy lift capabilities to the fleet."),
    BULK_CARRIER("Bulk carrier", "Merchant ship specially designed to transport unpackaged bulk cargo"),
    BARGE("Barge", "A roomy usually flat-bottomed boat used chiefly for the transport of \n " +
            "goods on inland waterways and usually propelled by towing"),
    TUG("Tug boat", "A boat or ship that maneuvers vessels by pushing or towing them"),
    BUNKER("Refueling/Bunkering vessel", "Small tanker transporting and carrying bunker fuel used for ship propulsion"),
    DIVING_VESSEL("Diving vessel", "Used as a floating base for professional diving projects"),
    WATER_BOAT("Water carrier vessel", "Transporting and carrying fresh water"),
    LIQUEFIED_GAS_CARRIER("Liquefied gas carrier vessel", "Ship designed to transport LPG, LNG, CNG, or liquefied chemical gases in bulk"),
    HYDROGRAPHIC("Hydrographical/Surveying vessel", "Type of ship or boat that is used for underwater surveys, usually to\n" +
            " collect data for mapping or planning underwater construction or mineral extraction"),
    CARGO("Cargo vessel", "This Vessel transports heavy goods and materials from one port to another"),
    CARGO_AND_PASSENGER("Cargo and passenger vessel", "A merchant ship whose primary function is to carry passengers and a little cargo on the sea"),
    DREDGER("Dredger vessel", "Type of boat that is equipped with a tool, called a dredge, that draws, sucks, excavates or\n" +
            " scrapes sediment such as sand, silt, gravel, trash, rocks, debris and animal and plant matter \n" +
            " from the ocean floor, sea bed, lakes or a waterway such as a river, estuary or canal"),
    CABLE("Cable vessel", "A deep-sea vessel designed and used to lay underwater cables for telecommunications,\n" +
            " electric power transmission, military, or other purposes"),
    CATAMARAN("Catamaran", "A multi-hulled watercraft featuring two parallel hulls of equal size"),
    WHALER("Whaling vessel", "A whaler or whaling ship is a specialized vessel, designed or adapted for whaling: the catching or processing of whales"),
    CONTAINER("Container vessel", "A cargo ship that carries all of its load in truck-size intermodal containers, in a technique called containerization"),
    ICEBREAKER("Icebreaker vessel", "a special-purpose ship or boat designed to move and navigate through\n" +
            " ice-covered waters, and provide safe waterways for other boats and ships"),
    LIGHTER("Lighter vessel", "A type of flat-bottomed barge used to transfer goods and passengers to and from moored ships"),
    LIGHTER_ABOARD_SHIP("Lighter aboard vessel", "A single-decked vessel with large hatches, wing tank arrangements, and a clear access to the stern"),
    PILOT_BOAT("Pilot boat", "A type of boat used to transport maritime pilots between land and the inbound or outbound ships that they are piloting"),
    GARBAGE_BOAT("Rubbish barge", "A technologically advanced working boat for the clean-up and collection of wastes on the water surfaces"),
    RESEARCH("Research vessel", "Ship or boat designed, modified, or equipped to carry out research at sea"),
    SUPPLY("Supply vessel", "a self-propelled vessel used for carrying supplies to and from off-shore and in-harbor\n" +
            " locations including, but not limited to, off-shore work platforms, construction sites, and other vessels"),
    FERRY("Ferry", "Vessel that carries passengers and (in many cases) their vehicles on fixed routes over short cross-water passages"),
    SAILING("Sailing vessel", "A sea-going vessel that uses sails mounted on masts to harness the power of wind and propel the vessel"),
    PASSENGER("Passenger vessel", "A merchant ship whose primary function is to carry passengers on the sea"),
    FLOATING_CRANE("Floating crane", "A ship with a crane specialized in lifting heavy loads, typically exceeding 1,500 t\n" +
            " (1,500 long tons; 1,700 short tons) for modern ships"),
    LIGHTSHIP("Floating light vessel", "A ship that acts as a lighthouse"),
    FIRE_FIGHTING("Fire-fighting vessel", "A specialized watercraft with pumps and nozzles designed for fighting shoreline and shipboard fires"),

    REFRIGERATOR("Reefer vessel", "A refrigerated cargo ship typically used to transport perishable cargo,\n" +
            " which require temperature-controlled handling, such as fruits, meat,\n" +
            " vegetables, dairy products, and similar items"),
    RO_RO("Roll-on/Roll-off vessel", "Cargo ships designed to carry wheeled cargo, such as cars, motorcycles, trucks,\n" +
            " semi-trailer trucks, buses, trailers, and railroad cars, that are driven on and off\n" +
            " the ship on their own wheels or using a platform vehicle, such as a self-propelled modular transporter"),
    FISHING_BOAT("Fishing boat", "A boat or ship used to catch fish in the sea, or on a lake or river"),
    HOPPER_DREDGER("Hopper dredger", "A trailing suction hopper dredger is a ship that has a full sailing capacity\n" +
            " used to maintain navigable waterways, deepening the maritime canals that are\n" +
            " threatened to become silted, to construct new land elsewhere or to replace sand\n" +
            " eroded by storms or wave action on the beaches"),
    CATTLE_CARRIER("Cattle carrier vessel", "A large ship used in the live export of sheep, cattle and goats"),
    DRY_CARGO("Dry cargo vessel", "A vessel designed to carry dry cargoes in bulk"),
    TANKER("Tanker", "A ship designed to carry liquid cargo in bulk within its\n" +
            " cargo spaces, without the use of barrels or other containers"),
    TRAWLER("Trawler vessel", "Fishing vessel that uses a trawl, a conical net that snares fish by\n" +
            " being dragged through the water or along the bottom");

    private final String type;

    private final String description;

    public static final String NVT = "That type is not available ";

    VesselType(String type, String description) {
        this.type = type;
        this.description = description;
    }
//
//    public static VesselType getVesselType(String type) {
//        return Arrays.stream(values()).filter(vesselType ->
//                        vesselType.getType().equals(type)).findAny()
//                .orElseThrow(() -> new NotFoundInBaseException(NVT));
//    }
}