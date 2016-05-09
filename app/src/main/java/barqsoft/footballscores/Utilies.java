package barqsoft.footballscores;

/**
 * Created by yehya khaled on 3/3/2015.
 */
public class Utilies
{
    public static final int SERIE_A = 357;
    public static final int PREMIER_LEGAUE = 354;
    public static final int CHAMPIONS_LEAGUE = 362;
    public static final int PRIMERA_DIVISION = 358;
    public static final int BUNDESLIGA = 351;
    public static String getLeague(int league_num)
    {
        switch (league_num)
        {
            case SERIE_A : return "Seria A";
            case PREMIER_LEGAUE : return "Premier League";
            case CHAMPIONS_LEAGUE : return "UEFA Champions League";
            case PRIMERA_DIVISION : return "Primera Division";
            case BUNDESLIGA : return "Bundesliga";
            default: return "Not known League Please report";
        }
    }
    public static String getMatchDay(int match_day,int league_num)
    {
        if(league_num == CHAMPIONS_LEAGUE)
        {
            if (match_day <= 6)
            {
                return "Group Stages, Matchday : 6";
            }
            else if(match_day == 7 || match_day == 8)
            {
                return "First Knockout round";
            }
            else if(match_day == 9 || match_day == 10)
            {
                return "QuarterFinal";
            }
            else if(match_day == 11 || match_day == 12)
            {
                return "SemiFinal";
            }
            else
            {
                return "Final";
            }
        }
        else
        {
            return "Matchday : " + String.valueOf(match_day);
        }
    }

    public static String getScores(int home_goals,int awaygoals)
    {
        if(home_goals < 0 || awaygoals < 0)
        {
            return " - ";
        }
        else
        {
            return String.valueOf(home_goals) + " - " + String.valueOf(awaygoals);
        }
    }

    public static int getTeamCrestByTeamName (String teamname)
    {
        //Log.i("Nama Klub : ", teamname);
        if (teamname==null){return R.drawable.no_icon;}
        switch (teamname)
        { //This is the set of icons that are currently in the app. Feel free to find and add more
            //as you go.
            case "Arsenal London FC" : return R.drawable.arsenal;
            case "Manchester United FC" : return R.drawable.manchester_united;
            case "Swansea City" : return R.drawable.swansea_city_afc;
            case "Leicester City FC" : return R.drawable.leicester_city_fc_hd_logo;
            case "Everton FC" : return R.drawable.everton_fc_logo1;
            case "West Ham United FC" : return R.drawable.west_ham;
            case "Tottenham Hotspur FC" : return R.drawable.tottenham_hotspur;
            case "West Bromwich Albion" : return R.drawable.west_bromwich_albion_hd_logo;
            case "Sunderland AFC" : return R.drawable.sunderland;
            case "Stoke City FC" : return R.drawable.stoke_city;
            case "Norwich City FC" : return R.drawable.norwich_city;
            case "Hamburger SV" : return R.drawable.hamburger_sv;
            case "VfL Wolfsburg" : return R.drawable.vfl_wolfsburg;
            case "Eintracht Frankfurt" : return R.drawable.eintracht_frankfurt;
            case "Borussia Dortmund" : return R.drawable.borussia_dortmund;
            case "Bor. Mönchengladbach" : return R.drawable.bor_monchengladbach;
            case "Bayer Leverkusen" : return R.drawable.bayer_leverkusen;
            case "FC Ingolstadt 04" : return R.drawable.fc_ingolstadt;
            case "FC Bayern München" : return R.drawable.fc_bayern_munchen;
            case "Hannover 96" : return R.drawable.hannover;
            case "TSG 1899 Hoffenheim" : return R.drawable.tsg_hoffenheim;
            case "Hertha BSC" : return R.drawable.hertha_bsc;
            case "SV Darmstadt 98" : return R.drawable.sv_darmstadt;
            case "1. FC Köln" : return R.drawable.fc_koln;
            case "Werder Bremen" : return R.drawable.werder_bremen;
            case "FC Schalke 04" : return R.drawable.fc_schalke;
            case "FC Augsburg" : return R.drawable.fc_augsburg;
            case "VfB Stuttgart" : return R.drawable.vfb_stuttgart;
            case "1. FSV Mainz 05" : return R.drawable.fsv_mainz;
            case "Liverpool FC" : return R.drawable.liverpool_fc;
            case "Swansea City FC" : return R.drawable.swansea_city;
            case "Aston Villa FC" : return R.drawable.aston_villa;
            case "Newcastle United FC" : return R.drawable.newcastle_united;
            case "AFC Bournemouth" : return R.drawable.afc_bournemouth;
            case "West Bromwich Albion FC" : return R.drawable.wet_bromwich;
            case "Crystal Palace FC" : return R.drawable.crystal_palace;
            case "Sunderlan AFC" : return R.drawable.sunderland;
            case "FC Internazionale Milano" : return R.drawable.intermilan;
            case "Empoli FC" : return R.drawable.empoli_fc;
            case "Leicester Cisty FC" : return R.drawable.leicester_city;
            case "Bologna FC" : return R.drawable.bologna_fc;
            case "AC Milan" : return R.drawable.ac_milan;
            case "Watford FC" : return R.drawable.watford_fc;

            case "AS Roma" : return  R.drawable.as_roma;
            case "AC Chievo Verona" : return R.drawable.chievo_verona;
            case "Southampton FC" : return R.drawable.southampton_fc;
            case "UC Sampdoria" : return R.drawable.sampdoria;
            case "Genoa CFC" : return R.drawable.genoa_cfc;
            case "Atalanta BC" : return R.drawable.atlanta_bc;
            case "Udinese Calcio" : return R.drawable.udinese_calcio;
            case "ACF Fiorentina" : return R.drawable.fiorentina;
            case "US Cittá di Palermo" : return R.drawable.citta_palermo;
            case "Frosinone Calcio" : return R.drawable.frosinone_calcio;
            case "US Sassuolo Calcio" : return R.drawable.sassuolo_calcio;
            case "Carpi FC" : return R.drawable.carpi_fc;
            case "SS Lazio" : return R.drawable.lazio;
            case "VfL Bochum" : return R.drawable.bochum;
            case "Eintracht Braunschweig" : return R.drawable.eintracht_braunschweig;
            case "Arminia Bielefeld" : return R.drawable.arminia_bielefeld;
            case "1. FC Union Berlin" : return R.drawable.union_berlin;
            case "TSV 1860 München" : return R.drawable.tsv_munchen;
            case "SC Paderborn 07" : return R.drawable.paderbon;
            case "Fortuna Düsseldorf" : return R.drawable.fortuna_dusseldorf;
            case "FSV Frankfurt" : return R.drawable.fsv_frankfurt;
            case "SC Freiburg" : return R.drawable.freiburg;
            case "1. FC Heidenheim 1846" : return R.drawable.fc_heidenhein;
            case "1. FC Kaiserslautern" : return R.drawable.kaiserslautern;
            case "SpVgg Greuther Fürth" : return R.drawable.greauther_furth;
            case "1. FC Nürnberg" : return R.drawable.nurnberg;
            case "FC St. Pauli" : return R.drawable.st_pauli;
            case "Red Bull Leipzig" : return R.drawable.redbull_leipzig;
            case "Karlsruher SC" : return R.drawable.karlrsruher;
            case "SV Sandhausen" : return R.drawable.sandhausen;
            case "MSV Duisburg" : return R.drawable.msv_duisburg;
            case "Manchester City FC" : return R.drawable.mancester_city;
            case "Arsenal FC" : return R.drawable.arsenal_fc;
            case "Getafe CF" : return R.drawable.getafe_cf;
            case "Sporting Gijón" : return R.drawable.sporting_gijon;
            case "FC Barcelona" : return R.drawable.barcelona;
            case "RCD Espanyol" : return R.drawable.espanyol;
            case "SD Eibar" : return R.drawable.eibar;
            case "Real Betis" : return R.drawable.real_betis;
            case "UD Las Palmas" : return R.drawable.las_palmas;
            case "Athletic Club" : return R.drawable.athletic_club;
            case "Levante UD" : return R.drawable.levante_ud;
            case "Club Atlético de Madrid" : return R.drawable.atletico_madrid;
            case "Real Madrid CF" : return R.drawable.real_madrid;
            case "Valencia CF" : return R.drawable.valencia;
            case "Real Sociedad de Fútbol" : return R.drawable.real_sociedad;
            case "Rayo Vallecano de Madrid" : return R.drawable.vallecano_madrid;
            case "Sevilla FC" : return R.drawable.sevilla_fc;
            case "Granada CF" : return R.drawable.granada_cf;
            case "Villareal CF" : return R.drawable.villareal;
            case "RC Deportivo La Coruna" : return R.drawable.deportivo_coruna;
            case "RC Celta de Vigo" : return R.drawable.celta_vigo;
            case "Málaga CF" : return R.drawable.malaga_cf;
            case "Hellas Verona FC" : return R.drawable.hellas_ferona;
            case "Juventus Turin" : return R.drawable.juventus_turin;
            case "Torino FC" : return R.drawable.torino;
            case "SSC Napoli" : return R.drawable.napoli;




            default: return R.drawable.no_icon;
        }
    }
}
