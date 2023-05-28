package org.sreekanth.core;

import org.sreekanth.core.entity.Captain;
import org.sreekanth.core.entity.Team;
import org.sreekanth.core.entity.UserEntity;
import org.sreekanth.core.repository.UserRepository;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        UserEntity userEntity = new UserEntity();
        //userEntity.setAltKey(125);
        userEntity.setName("zzzzzzzzz");
        userEntity.setEmail("aaa@gmai.com");
        userEntity.setPassword("32157");
        userEntity.setCity("Bangalore");
        userEntity.setCountry("India");
        userEntity.setPinCode("789");
        userEntity.setContactNumber("2314687");
        
        UserRepository repository=new UserRepository();
//        
       // repository.saveOrUpdate(userEntity);
        UserEntity entity = repository.findById(7);
        System.out.println(entity);
//        
//        /*UserDto userDto = new UserDto();
//        userDto.setAlt_key(126);
//        userDto.setName("Sreekanth");
//        userDto.setCity("New Bng");
//        userDto.setCountry("New India");
//        userDto.setEmail("s@gmail.com");
//        userDto.setPinCode("515721");
//        repository.update(userDto);
//      */
//        
//        UserEntity entity = new UserEntity();
//        //entity.setAltKey(124);
//       // repository.delete(entity);
//        
//        UserHqlRepository hqlRepository = new UserHqlRepository();
//        /*List<UserEntity> userEntityList = hqlRepository.findAll();
//        userEntityList.forEach(each->{
//        	System.out.println(each);
//        });
//        */
//        
//        
////        List<UserEntity> userEntitySortedList=userEntityList.stream()
////        			.filter(each->each.getName().equalsIgnoreCase("Abijeeth"))
////        			.collect(Collectors.toList());
//        
//       /* List<UserEntity> findByName = hqlRepository.findByName("Joyson");
//        findByName.forEach(each->{
//        	System.out.println(each);
//        });
//        */
//        
//       // hqlRepository.updatePasswordByEmail("000", "j@gmai.com");
//        
//       // hqlRepository.deleteUserByEmail("j@gmai.com");
//        
        
        
//        Team team=new Team();
//        team.setName("Indian Hocky ");
//        team.setTeamSize("12");
//        team.setTeamType("Hocky");
//        
//        Captain captain = new Captain();
//        captain.setCaptainName("Sreekanth");
//        captain.setAge("35");
//        captain.setEmail("ns@bcci.com");
//        
//        team.setCaptain(captain);
        
        
        
//        AssosiationRepository repository = new AssosiationRepository();
//        
//        AirHosterss airHosterss = new AirHosterss();
//        airHosterss.setName("samanth M");
//        airHosterss.setAge("35");
//        
//        AirHosterss airHosterss1 = new AirHosterss();
//        airHosterss1.setName("Rashmika R");
//        airHosterss1.setAge("40");
//        
//        AirHosterss airHosterss2 = new AirHosterss();
//        airHosterss2.setName("Katrina Kaif");
//        airHosterss2.setAge("60");
//        
//        ArrayList<AirHosterss> arrayList = new ArrayList<AirHosterss>();
//        arrayList.add(airHosterss);
//        arrayList.add(airHosterss1);
//        arrayList.add(airHosterss2);
//        
//        Flight flight = new Flight();
//        flight.setName("Indigo");
//        flight.setPrice("100000");
//        flight.setNumOfSeats("100");
//        flight.setAirhostress(arrayList);
//        repository.saveFlightDetails(flight);
//        
        
//        
//        AssosiationRepository repository = new AssosiationRepository();
//        Product product = new Product();
//        product.setProductName("curd");
//        Product product1 = new Product();
//        product1.setProductName("milk");
//        Product product2 = new Product();
//        product2.setProductName("ghee");
//        
//        ArrayList<Product> products = new ArrayList<Product>();
//        
//        products.add(product);
//        products.add(product1);
//        products.add(product2);
//        
//        
//        Brand brand = new Brand();
//        brand.setBrand("amul");
//        brand.setProducts(products);
//        
//        Brand brand1 = new Brand();
//        brand1.setBrand("nandini");
//        brand1.setProducts(products);
//        
//        Brand brand2 = new Brand();
//        brand2.setBrand("gayatri");
//        brand2.setProducts(products);
//        
//        ArrayList<Brand> brands = new ArrayList<Brand>();
//        brands.add(brand);
//        brands.add(brand1);
//        brands.add(brand2);
//        
//        product.setBrands(brands);
//        product1.setBrands(brands);
//        product2.setBrands(brands);
//        
//        
//        repository.saveBrandDetails(brand1);
//        
   }
}








